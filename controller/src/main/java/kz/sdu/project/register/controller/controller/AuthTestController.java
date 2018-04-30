package kz.sdu.project.register.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.register.controller.model.AuthModel;
import kz.sdu.project.register.controller.register.AuthRegister;
import kz.sdu.project.register.controller.util.Controller;

@Bean
public class AuthTestController implements Controller {

    public BeanGetter<AuthRegister> authRegister;
    @Mapping("/login")
    @ToJson
    public AuthModel checkAuth(@Par("username")String username,@Par("password")String password){
        return new AuthModel();
    }
}
