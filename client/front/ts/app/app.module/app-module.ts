import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {AppComponent} from "../app.component/app-component";
import {HttpService} from "../../provider/HttpService";
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";

@NgModule({
    imports:[
        BrowserModule,
        FormsModule,
        HttpModule
    ],
    declarations:[AppComponent],
    bootstrap:[AppComponent],
    entryComponents:[AppComponent],
    providers:[HttpService]
})
export class AppModule{

}