package kz.sdu.project.register.beans.postgres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.register.controller.controller.BeanConfigForPackageController;

@BeanConfig
@BeanScanner
@Include({BeanConfigForPackageController.class})
public class BeanConfigAll {
}
