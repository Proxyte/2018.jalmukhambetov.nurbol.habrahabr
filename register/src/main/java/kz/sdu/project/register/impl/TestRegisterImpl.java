package kz.sdu.project.register.impl;

import kz.sdu.project.register.controller.register.TestRegister;
import kz.sdu.project.register.postgres.TestDao;
import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;

@Bean
public class TestRegisterImpl implements TestRegister{

    public BeanGetter<TestDao> testDao;

    @Override
    public String getText() {
        return testDao.get().getTestText();
    }
}