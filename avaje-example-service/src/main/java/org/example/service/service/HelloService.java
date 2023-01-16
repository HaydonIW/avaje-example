package org.example.service.service;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

    public String hello(final String name) {
        return String.format("Hello '%s'.", name);
    }

}
