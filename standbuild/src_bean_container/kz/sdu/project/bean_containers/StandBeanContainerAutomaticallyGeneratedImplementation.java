package kz.sdu.project.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.sdu.project.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.sdu.project.beans.StandServer standServer() {
    return getter_native_StandServer_4.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.beans.CrossOriginFilterRegistration> cachedValue_native_CrossOriginFilterRegistration_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.CrossOriginFilterRegistration> getter_native_CrossOriginFilterRegistration_1 = this::get_native_CrossOriginFilterRegistration_1;
  private kz.sdu.project.beans.CrossOriginFilterRegistration get_native_CrossOriginFilterRegistration_1 () {
    {
      kz.sdu.project.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.beans.CrossOriginFilterRegistration x = cachedValue_native_CrossOriginFilterRegistration_1.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.beans.CrossOriginFilterRegistration localValue = new kz.sdu.project.beans.CrossOriginFilterRegistration();
        cachedValue_native_CrossOriginFilterRegistration_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.beans.JettyControllerRegistration> cachedValue_native_JettyControllerRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.JettyControllerRegistration> getter_native_JettyControllerRegistration_2 = this::get_native_JettyControllerRegistration_2;
  private kz.sdu.project.beans.JettyControllerRegistration get_native_JettyControllerRegistration_2 () {
    {
      kz.sdu.project.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.beans.JettyControllerRegistration x = cachedValue_native_JettyControllerRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.beans.JettyControllerRegistration localValue = new kz.sdu.project.beans.JettyControllerRegistration();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.util.Controller>>)(java.lang.Object)getter_ref_list_Controller_7;
        localValue.view = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_StanBlogViews_3;
        cachedValue_native_JettyControllerRegistration_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.beans.StanBlogViews> cachedValue_native_StanBlogViews_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.StanBlogViews> getter_native_StanBlogViews_3 = this::get_native_StanBlogViews_3;
  private kz.sdu.project.beans.StanBlogViews get_native_StanBlogViews_3 () {
    {
      kz.sdu.project.beans.StanBlogViews x = cachedValue_native_StanBlogViews_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.beans.StanBlogViews x = cachedValue_native_StanBlogViews_3.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.beans.StanBlogViews localValue = new kz.sdu.project.beans.StanBlogViews();
        cachedValue_native_StanBlogViews_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.beans.StandServer> cachedValue_native_StandServer_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.StandServer> getter_native_StandServer_4 = this::get_native_StandServer_4;
  private kz.sdu.project.beans.StandServer get_native_StandServer_4 () {
    {
      kz.sdu.project.beans.StandServer x = cachedValue_native_StandServer_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.beans.StandServer x = cachedValue_native_StandServer_4.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.beans.StandServer localValue = new kz.sdu.project.beans.StandServer();
        localValue.standServerBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.StandServer>)(java.lang.Object)getter_native_StandServer_4;
        localValue.webAppContextRegistration = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.util.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_8;
        localValue.afterInject();
        cachedValue_native_StandServer_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.beans.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.beans.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_5 = this::get_native_Utf8FilterRegistration_5;
  private kz.sdu.project.beans.Utf8FilterRegistration get_native_Utf8FilterRegistration_5 () {
    {
      kz.sdu.project.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_5.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.beans.Utf8FilterRegistration localValue = new kz.sdu.project.beans.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.project.controller.controller.TestController> cachedValue_native_TestController_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.project.controller.controller.TestController> getter_native_TestController_6 = this::get_native_TestController_6;
  private kz.sdu.project.controller.controller.TestController get_native_TestController_6 () {
    {
      kz.sdu.project.controller.controller.TestController x = cachedValue_native_TestController_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.project.controller.controller.TestController x = cachedValue_native_TestController_6.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.project.controller.controller.TestController localValue = new kz.sdu.project.controller.controller.TestController();
        cachedValue_native_TestController_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.controller.util.Controller>> getter_ref_list_Controller_7 = this::get_ref_list_Controller_7;
  private java.util.List<kz.sdu.project.controller.util.Controller> get_ref_list_Controller_7() {
    java.util.List<kz.sdu.project.controller.util.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_TestController_6.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.project.util.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_8 = this::get_ref_list_WebAppContextRegistration_8;
  private java.util.List<kz.sdu.project.util.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_8() {
    java.util.List<kz.sdu.project.util.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_CrossOriginFilterRegistration_1.get());
    list.add(getter_native_JettyControllerRegistration_2.get());
    list.add(getter_native_Utf8FilterRegistration_5.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
