package com.alura.conversormonedas.model;

import com.google.gson.annotations.SerializedName;

public class TasaConversion
{
    @SerializedName("conversion_rate")
    private double tasa;

    public double getTasa()
    {
        return tasa;
    }
}
