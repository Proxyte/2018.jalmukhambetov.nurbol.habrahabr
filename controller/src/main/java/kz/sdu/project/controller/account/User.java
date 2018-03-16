package kz.sdu.project.controller.account;

public class User {
    public User(String login,String password,String name_acc){
        this.login = login;
        this.password = password;
        this.name_acc = name_acc;
    }
    public String login;
    public String password;
    public String name_acc;
}
