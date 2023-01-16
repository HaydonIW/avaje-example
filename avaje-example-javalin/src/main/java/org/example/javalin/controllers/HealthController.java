package org.example.javalin.controllers;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Path;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;
import jakarta.inject.Singleton;

@Path("/health")
@Controller
@Singleton
public class HealthController {

    @Get
    public void health(final Context ctx) {
        ctx.status(HttpStatus.OK);
    }

}
