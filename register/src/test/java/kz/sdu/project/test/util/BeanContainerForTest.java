package kz.sdu.project.test.util;

import kz.sdu.project.register.beans.postgres.AllBeanConfig;
import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.Include;

@BeanConfig
@Include({AllBeanConfig.class})
public class BeanContainerForTest {
}
