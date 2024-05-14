package com01.requests.filmsStarWars.request;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class RequestFilm {

    public HttpClient getClient() {
        return HttpClient.newHttpClient();
    }

    public HttpRequest getRequest(String uri) {
        return HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

    }
}
