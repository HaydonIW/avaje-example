package org.example.service;

import io.avaje.inject.InjectModule;
import io.avaje.jsonb.Jsonb;
import org.example.javalin.AvajeJavalinBootstrapper;

@InjectModule(requires = Jsonb.class)
public class Main {

    public static void main(final String[] args) {
        AvajeJavalinBootstrapper.boot();
    }

}