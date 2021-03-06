package kz.sdu.project.register.launcher;

import kz.greetgo.depinject.gen.DepinjectUtil;
import kz.sdu.project.register.bean_containers.StandBeanContainer;
import kz.sdu.project.register.util.Modules;
import kz.greetgo.depinject.Depinject;

public class StandLauncher{
    public static void main(String[] args) throws Exception {
        new StandLauncher().run();
    }

    private static void run() throws Exception {
        DepinjectUtil.implementAndUseBeanContainers( "kz.sdu.project",
                Modules.standDir()+"build/src_bean_container");
        Depinject.newInstance(StandBeanContainer.class);

        StandBeanContainer standBeanContainer = Depinject.newInstance(StandBeanContainer.class);

        standBeanContainer.standServer().start();
    }
}