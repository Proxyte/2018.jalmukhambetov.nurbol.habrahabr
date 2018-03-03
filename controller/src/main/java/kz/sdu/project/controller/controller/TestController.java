package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.register.TestRegister;
import kz.sdu.project.controller.util.Controller;

@Bean
public class TestController implements Controller {

    public BeanGetter<TestRegister> testRegisterBean;
    @ToJson
    @Mapping("/getMainText")
    public String getText(){
//        System.out.println("gxhgdhgdhg");
//        return "ALL IS GONNA OK";
        return testRegisterBean.get().getText();
    }
}
