package kz.sdu.project.register.dao.postgres;

import kz.sdu.project.register.beans.postgres.DaoImplFactory;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanScanner;

@BeanConfig(defaultFactoryClass = DaoImplFactory.class)
@BeanScanner
public class DaoBeanConfig {
}
