package kz.sdu.project.register.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.register.postgres.BeanConfigForPackageBeans;
import kz.sdu.project.register.controller.controller.BeanConfigForPackageController;
import kz.sdu.project.register.controller.register_impl.BeanConfigForRegisterImpl;
import kz.sdu.project.register.login_impl.BeanConfigForPackageLoginImpl;

@BeanConfig
@Include({BeanConfigForPackageBeans.class,
        BeanConfigForPackageController.class,
        BeanConfigForRegisterImpl.class,
        BeanConfigForPackageLoginImpl.class})
public class BeanConfigForStandBeanContainer {

}
