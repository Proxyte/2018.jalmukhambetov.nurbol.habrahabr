const gulp = require("gulp");
const task = gulp.task;
const del = require("del");
const less = require('gulp-less');
const pug = require("gulp-pug");
const webpack = require('webpack');
const gulplog = require('gulplog');
const browserSync = require('browser-sync').create();
const path = require('path');
const notifier = require("node-notifier");


gulp.task('clean',function(){
    return del(['build']);
});

function outDir(){
    return path.resolve(__dirname,'build','public','nurbol_blog');
}

gulp.task('less',function(){
   return gulp.src('front/less/main.less').pipe(less()).pipe(gulp.dest(path.resolve(outDir(), 'css')));
});

gulp.task('pug',function(){
    return gulp.src('front/pug/index.pug').pipe(pug({pretty:true})).pipe(gulp.dest(outDir()));
});

gulp.task('assets',gulp.parallel('less','pug'));

gulp.task('webpack', function (callback) {
    let options = {
        entry: [path.resolve('.', 'front', 'ts', 'main.ts')],
        output: {
            path: path.resolve(outDir(), 'js'),
            publicPath: '/',
            filename: '[name].js',
            sourceMapFilename: '[name].js.map',
        },
        watch: isWatch,
        devtool: 'cheap-module-inline-source-map',
        module: {
            loaders: [{
                test: /\.ts$/,
                include: path.resolve(__dirname, 'front', 'ts'),
                loader: ['ts-loader'],
            }],
        },
        resolve: {
            extensions: [".ts", ".js"]
        },
        plugins: [
            new webpack.NoEmitOnErrorsPlugin() // otherwise error still gives a file
        ]
    };

    webpack(options, function (err, stats) {
        if (!err) { // no hard error
            // try to get a soft error from stats
            err = stats.toJson().errors[0];
        }

        if (err) {
            notifier.notify({
                title: 'Webpack',
                message: err
            });

            gulplog.error(err);
        } else {
            gulplog.info(stats.toString({
                colors: true
            }));
        }

        // task never errs in watch mode, it waits and recompile
        if (!options.watch && err) {
            callback(err);
        } else {
            callback();
        }

    });
});

gulp.task("build", gulp.series(
    'clean', function(callback){
        isWatch = false;
        callback();
    }, 'webpack', 'assets'
));

gulp.task('copy', function () {
    gulp.src([
        "front/iconfont/**/*.*"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'iconfont')));
    gulp.src([
        "node_modules/zone.js/dist/zone.min.js",
        "node_modules/core-js/client/shim.min.js"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'js')));
    return gulp.src([
        "node_modules/@angular/material/prebuilt-themes/indigo-pink.css",
        "node_modules/bootstrap/dist/css/bootstrap.min.css"
    ]).pipe(gulp.dest(path.resolve(outDir(), 'css')))
});

gulp.task('server', function(back) {
    browserSync.init({server: path.resolve('build', 'public','nurbol_blog')});
    browserSync.watch('build/public/**/*.*').on('change', browserSync.reload);
    back();
});

gulp.task('start', gulp.series(
    'clean', 'assets','copy', function (callback) {
        isWatch = true;
        callback();
    }, 'webpack', 'server',
    function () {
        gulp.watch('front/pug/**/*.pug', gulp.series('pug'));
        gulp.watch('front/less/**/*.less', gulp.series('less'));
    }
));

// 1st task
// gulp.task('ser',gulp.series('clean'));
// gulp.task('ser',gulp.series('pug'));
// gulp.task('ser',gulp.series('clean','less','pug'));

//2nd task
// gulp.task('par',gulp.series(gulp.parallel('less','pug')));

//3rd task
// gulp.task('par',gulp.series('clean',gulp.parallel('less','pug')));
