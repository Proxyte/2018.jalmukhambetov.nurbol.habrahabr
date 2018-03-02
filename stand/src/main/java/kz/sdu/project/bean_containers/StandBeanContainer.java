package kz.sdu.project.bean_containers;

import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;
import kz.sdu.project.beans.StandServer;

@Include(BeanConfigForStandBeanContainer.class)
public interface StandBeanContainer extends BeanContainer{
    StandServer standServer();
}