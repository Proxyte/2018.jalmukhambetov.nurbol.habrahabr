package kz.sdu.project.register.controller.controller;

import kz.sdu.project.register.controller.register.TestRegister;
import kz.sdu.project.register.controller.util.Controller;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
public class TestController implements Controller{

    public BeanGetter<TestRegister>  testRegisterBean;

    @ToJson
    @Mapping("/getMainText")
    public String getText(){
        return testRegisterBean.get().getText();
    }
}
