package kz.sdu.project.register.login_impl;

import kz.sdu.project.register.controller.login.TestLogin;
import kz.sdu.project.register.controller.account.User;
import kz.greetgo.depinject.core.Bean;

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
