package kz.sdu.project.register.postgres;


import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.core.HasAfterInject;
import kz.sdu.project.register.util.Modules;
import kz.sdu.project.register.util.WebAppContextRegistration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.Comparator;
import java.util.List;

@Bean
public class StandServer implements HasAfterInject {
    public final Server server = new Server(1314);


    public StandServer start() throws Exception {
        server.start();
        System.out.println("server started");
        return this;
    }

    public BeanGetter<List<WebAppContextRegistration>> webAppContextRegistration;
    public BeanGetter<StandServer> standServerBeanGetter;
    @Override
    public void afterInject() throws Exception {
        WebAppContext webAppServlet = new WebAppContext(
                Modules.clientDir().toPath().resolve(".").toString(),"/blog"
        );

        webAppContextRegistration.get().stream()
                .sorted(Comparator.comparingDouble(WebAppContextRegistration::priority))
                .forEachOrdered(r -> r.registerTo(webAppServlet));

        server.setHandler(webAppServlet);
    }
}
