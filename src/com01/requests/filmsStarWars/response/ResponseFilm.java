package com01.requests.filmsStarWars.response;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ResponseFilm {

    private final HttpClient client;
    private final HttpRequest request;

    public ResponseFilm(HttpClient client, HttpRequest request) {
        this.client = client;
        this.request = request;
    }

    public HttpResponse<String> getResponse() {
        try {
            return client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al intentar hacer la solicitud, verifique la URI");
            throw new RuntimeException(e);
        }
    }
}
