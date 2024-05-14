package com01.requests.filmsStarWars.request;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class RequestFilm {

    private final String uri;

    public RequestFilm(String uri) {
        this.uri = uri;
    }

    public HttpClient getClient() {
        return HttpClient.newHttpClient();
    }

    public HttpRequest getRequest() {
        return HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
    }
}
