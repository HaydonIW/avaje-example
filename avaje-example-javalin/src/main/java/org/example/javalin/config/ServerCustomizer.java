package org.example.javalin.config;

import io.javalin.Javalin;

@FunctionalInterface
public interface ServerCustomizer {

    void customize(final Javalin javalin);

}
