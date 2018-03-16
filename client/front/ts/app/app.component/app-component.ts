import {Component, OnInit} from "@angular/core"
import {HttpService} from "../../provider/HttpService";
import "rxjs/add/operator/toPromise";


@Component({
    selector:"blog_app",
    template:"<h1>{{text}}</h1>"+
    '<div class="container">\n' +
    '    <div class="form-group">\n' +
    '        <label for="login">Login:</label>\n' +
    '        <input [(ngModel)]="login" placeholder="Enter your login">\n' +
    '    </div>\n' +
    '    <div class="form-group">\n' +
    '        <label for="password">Password:</label>\n' +
    '        <input [(ngModel)]="password" placeholder="Enter your password">\n' +
    '    </div>\n' +
    '    <div class="form-check">\n' +
    '        <input type="checkbox" class="form-check-input" id="rememberMeCheck">\n' +
    '        <label class="form-check-label" for="rememberMeCheck">Remember Me</label>\n' +
        '<div id = "error"><span>Invalid Password or login</span></div>'+
    '    <button class = "asd" (click)="loginFunc()">Login</button>' +
    '</div>'
})

export class AppComponent implements OnInit{
    private text:string;
    private login:string = "";
    private password:string = "";

    ngOnInit():void { //doing smth before operation
        this.httpService.get("/getMainText").toPromise().then(
            result => {
                this.text = result.json();
            },
            error=>{
                this.text = "something is gone wrong!!!";
            })
    }

    loginFunc():void{
        this.httpService.post("/getUsers",{login:this.login,password:this.password})
            .toPromise().then(
            result => {
                this.text = result.json();
            },
            error=>{
                this.text = "something is gone wrong!!!";
            })
    }

    constructor(private httpService:HttpService){

    }
}
