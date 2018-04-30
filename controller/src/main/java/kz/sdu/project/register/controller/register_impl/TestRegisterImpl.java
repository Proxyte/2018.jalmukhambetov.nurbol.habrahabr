package kz.sdu.project.register.controller.register_impl;

import kz.greetgo.depinject.core.Bean;
import kz.sdu.project.register.controller.register.TestRegister;

@Bean
public class TestRegisterImpl implements TestRegister {
    @Override
    public String getText() {
        return "Anything is here";
    }
}
