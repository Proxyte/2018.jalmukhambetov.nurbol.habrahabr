package kz.sdu.project.register.postgres;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.JettyWarServlet;
import kz.greetgo.mvc.interfaces.Views;
import kz.sdu.project.register.controller.util.Controller;
import kz.sdu.project.register.util.WebAppContextRegistration;

import java.util.ArrayList;
import java.util.List;

@Bean
public class JettyControllerRegistration extends JettyWarServlet implements WebAppContextRegistration {
    public BeanGetter<List<Controller>> controllerList;

    @Override
    protected List<Object> getControllerList() {
       List<Object> ret = new ArrayList<>();
       ret.addAll(controllerList.get());
       return ret;
    }

    public BeanGetter<Views> view;

    @Override
    protected Views getViews() {
        return view.get();
    }

    @Override
    protected String mappingBase(){
        return  getTargetSubContext()+"/*";
    }

    @Override
    protected String getTargetSubContext() {
        return "/api";
    }

    @Override
    public double priority() {
        return 0;
    }
}
