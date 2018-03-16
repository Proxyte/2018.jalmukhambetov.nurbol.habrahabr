package kz.sdu.project.login_impl;

import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.project.controller.login.TestLogin;
import kz.sdu.project.controller.account.User;
import kz.greetgo.depinject.core.Bean;

import java.util.List;
import java.util.Arrays;

@Bean
public class TestLoginImpl implements TestLogin{
    public User [] accounts = {
            new User("Proxyte","123","Nurbol"),
            new User("FoxTrout","cs","Nurik")
    };

    @Override
    public String getAccs(String login,String password){
        System.out.println(login+" "+password);
        for(User user : accounts){
            if(user.login.equals(login) && user.password.equals(password)) {
                return "success";
            }
        }
        return "Invalid login or pass";
    }
}
