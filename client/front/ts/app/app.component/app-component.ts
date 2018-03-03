import {Component, OnInit} from "@angular/core"
import {HttpService} from "../../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"blog_app",
    template:"<h1>{{text}}</h1>"
    // '<div class="container">\n' +
    // '    <div class="form-group">\n' +
    // '        <label for="login">Login:</label>\n' +
    // '        <input type="text" class="form-control" id="login">\n' +
    // '    </div>\n' +
    // '    <div class="form-group">\n' +
    // '        <label for="password">Password:</label>\n' +
    // '        <input type="password" class="form-control" id="password">\n' +
    // '    </div>\n' +
    // '    <div class="form-check">\n' +
    // '        <input type="checkbox" class="form-check-input" id="rememberMeCheck">\n' +
    // '        <label class="form-check-label" for="rememberMeCheck">Remember Me</label>\n' +
    // '    </div>\n' +
    // '    <input type="submit" class="btn btn-primary" value="Login">\n' +
    // '</div>'
})

export class AppComponent implements OnInit{
    private text:string;

    ngOnInit():void { //doing smth before operation
        this.httpService.get("\getMainText").toPromise().then(
            result => {
                this.text = result.json().text;
            },
            error=>{
                this.text = "something is gone wrong!!!";
            })
    }
    constructor(private httpService:HttpService){
        httpService.post
    }
}
