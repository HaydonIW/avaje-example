package org.example.javalin;

import io.avaje.inject.BeanScope;
import io.javalin.Javalin;

public class AvajeJavalinBootstrapper {

    public static void boot() {
        boot(BeanScope.builder().build());
    }

    public static void boot(final BeanScope beanScope) {
        final Javalin javalin = beanScope.get(Javalin.class);

        // TODO: Use Avaje Config to pull the host and port that Javalin should be started on.
        //       One thing to note though is that we already used a ServerCustomizer to configure the Javalin instance
        //       so it feels odd doing extra configuration here. Almost as if JavalinConfig should have both a 'host'
        //       and 'port' field and the Javalin.start() method just pulls from that config if it had defined fields,
        //       otherwise, then default to what its current functionality defaults to?
        javalin.start();
    }

}