package kz.sdu.project.register.postgres;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;
import kz.sdu.project.register.beans.postgres.DaoImplFactory;

@BeanConfig(defaultFactoryClass = DaoImplFactory.class)
@BeanScanner
public class DaoBeanConfig {
}
