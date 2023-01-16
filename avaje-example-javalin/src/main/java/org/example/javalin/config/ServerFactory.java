package org.example.javalin.config;

import io.avaje.http.api.WebRoutes;
import io.avaje.inject.Bean;
import io.avaje.inject.Factory;
import io.avaje.jsonb.Jsonb;
import io.javalin.Javalin;
import io.javalin.plugin.bundled.RouteOverviewPlugin;

import java.util.List;

@Factory
public class ServerFactory {

    @Bean
    Javalin javalin(final List<WebRoutes> webRoutes, final List<ServerCustomizer> customizers) {
        final Javalin javalin = Javalin.create();

        javalin.updateConfig(javalinConfig -> {
            javalinConfig.showJavalinBanner = false;

            javalinConfig.plugins.register(new RouteOverviewPlugin("/"));
            javalinConfig.plugins.enableDevLogging();
        });

        javalin.routes(() -> {
            for (final WebRoutes webRoute : webRoutes) {
                webRoute.registerRoutes();
            }
        });

        for (final ServerCustomizer customizer : customizers) {
            customizer.customize(javalin);
        }

        return javalin;
    }

    @Bean
    Jsonb jsonb() {
        return Jsonb.builder().build();
    }

}
