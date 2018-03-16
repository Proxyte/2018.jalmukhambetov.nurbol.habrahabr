package kz.sdu.project.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.beans.BeanConfigForPackageBeans;
import kz.sdu.project.controller.controller.BeanConfigForPackageController;
import kz.sdu.project.controller.register_impl.BeanConfigForRegisterImpl;
import kz.sdu.project.login_impl.BeanConfigForPackageLoginImpl;

@BeanConfig
@Include({BeanConfigForPackageBeans.class,
        BeanConfigForPackageController.class,
        BeanConfigForRegisterImpl.class,
        BeanConfigForPackageLoginImpl.class})
public class BeanConfigForStandBeanContainer {

}
