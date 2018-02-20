import {Component, OnInit} from "@angular/core"
import {HttpService} from "../../provider/HttpService";
import "rxjs/add/operator/toPromise";

@Component({
    selector:"blog_app",
    template:"<h1>result : {{text}}</h1>"
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
