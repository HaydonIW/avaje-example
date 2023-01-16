package org.example.service.controllers;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Path;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.example.service.service.HelloService;

@Path("/hello")
@Controller
@Singleton
public class HelloController {

    private final HelloService helloService;

    @Inject
    public HelloController(final HelloService helloService) {
        this.helloService = helloService;
    }

    @Get("/{name}")
    String name(final String name) {
        return this.helloService.hello(name);
    }

}
