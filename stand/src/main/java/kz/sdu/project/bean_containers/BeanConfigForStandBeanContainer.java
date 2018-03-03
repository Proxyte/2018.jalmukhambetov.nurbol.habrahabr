package kz.sdu.project.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.beans.BeanConfigForPackageBeans;
import kz.sdu.project.controller.controller.BeanConfigForPackageController;

@BeanConfig
@Include({BeanConfigForPackageBeans.class,BeanConfigForPackageController.class})
public class BeanConfigForStandBeanContainer {

}
