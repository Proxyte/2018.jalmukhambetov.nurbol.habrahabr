const gulp = require("gulp");
const task = gulp.task;
const del = require("del");
const less = require('gulp-less');
const pug = require("gulp-pug");
const path = require("path");

gulp.task('clean',function(){
    return del(['build']);
});

gulp.task('less',function(){
    return gulp.src('front/less/*.less').pipe(less())
        .pipe(gulp.dest(path.resolve(__dirname,'build','public','less')))
});

gulp.task('pug',function(){
    return gulp.src('front/pug/*.pug').pipe(pug())
        .pipe(gulp.dest(path.resolve(__dirname,'build','public','pug')))
});

// 1st task
gulp.task('ser',gulp.series('clean'));
// gulp.task('ser',gulp.series('clean','less','pug'));

//2nd task
gulp.task('par',gulp.series(gulp.parallel('less','pug')));

//3rd task
gulp.task('par',gulp.series('clean',gulp.parallel('less','pug')));
