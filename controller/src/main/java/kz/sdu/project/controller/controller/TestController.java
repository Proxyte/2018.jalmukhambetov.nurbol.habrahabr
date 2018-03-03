package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.util.Controller;

@Bean
public class TestController extends Controller {
    @ToJson
    @Mapping("getMainText")
    public String getText(){
        return "ALL IS GONNA OK";
    }
}
