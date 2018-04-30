package kz.sdu.project.register.beans.postgres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.register.controller.controller.BeanConfigForPackageController;
import kz.sdu.project.register.impl.BeanScannerForImpl;
import kz.sdu.project.register.postgres.DaoBeanConfig;

@BeanConfig
@BeanScanner
@Include({DaoBeanConfig.class, BeanScannerForImpl.class, BeanConfigForPackageController.class})
public class AllBeanConfig {
}
