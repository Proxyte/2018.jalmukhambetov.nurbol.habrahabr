import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {AppComponent} from "../app.component/app-component";
import {HttpService} from "../../provider/HttpService";
import {HttpModule} from "@angular/http";

@NgModule({
    imports:[
        BrowserModule,HttpModule
    ],
    declarations:[AppComponent],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent],
    providers:[HttpService]
})
export class AppModule{

}