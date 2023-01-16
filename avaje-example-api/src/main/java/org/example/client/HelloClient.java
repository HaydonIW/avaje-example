package org.example.client;

import io.avaje.http.api.Client;
import io.avaje.http.api.Get;
import io.avaje.http.client.HttpCall;

import java.net.http.HttpResponse;

@Client
public interface HelloClient {

    @Get("/hello/{name}")
    String helloSync(final String name);

    @Get("/hello/{name}")
    HttpCall<HttpResponse<String>> hello(final String name);

}
