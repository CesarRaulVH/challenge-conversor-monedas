package com.alura.conversormonedas.client;

import com.alura.conversormonedas.model.TasaConversion;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateClient
{
    private Gson gson = new Gson();

    public double obtenerConversion(String base, String destino)
    {
        TasaConversion tasa = new TasaConversion();

        try
        {
            String direccion =
                    "https://v6.exchangerate-api.com/v6/c91dd635b39313aa97909851/pair/" +
                            base + "/" + destino;

            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest solicitud = HttpRequest.newBuilder().
                    uri(URI.create(direccion)).build();

            HttpResponse<String> respuesta =cliente.
                    send(solicitud, HttpResponse.BodyHandlers.ofString());

            String json = respuesta.body();
            tasa = gson.fromJson(json, TasaConversion.class);
        }

        catch (IOException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        return tasa.getTasa();
    }
}