package com.alura.conversormonedas.service;

import com.alura.conversormonedas.client.ExchangeRateClient;

import java.util.Scanner;

public class ConversorService
{
    private ExchangeRateClient cliente = new ExchangeRateClient();
    Scanner lectura = new Scanner(System.in);

    public double convertir(String base, String destino, double monto)
    {
        double tasaConversion = 0;
        double montoConvertido = 0;

        tasaConversion = cliente.obtenerConversion(base, destino);
        montoConvertido = monto * tasaConversion;

        return montoConvertido;
    }

    public int imprimirMenu()
    {
        int opcion = 0;

        while(true)
        {
            System.out.println
                    ("""
                **************************
                Bienvenido(a) al Conversor de Monedas.
                
                1) Dolar -> Peso Argentino
                2) Peso Argentino -> Dolar
                3) Dolar -> Real Brasileño
                4) Real Brasileño -> Dolar
                5) Dolar -> Peso Colombiano
                6) Peso Colombiano -> Dolar
                7) Salir
                                
                Ingrese una opcion valida:
                **************************""");

            if(lectura.hasNextInt())
            {
                opcion = lectura.nextInt();
                break;
            }

            else
            {
                System.out.println("Entrada invalida. Ingrese un numero.");
                lectura.next();
            }
        }

        return opcion;
    }

    public double obtenerMontoInicial()
    {
        double monto = 0;

        while(true)
        {
            System.out.println("Ingrese el monto a convertir:");

            if(lectura.hasNextDouble())
            {
                monto = lectura.nextDouble();

                if(monto <= 0)
                {
                    System.out.println("Entrada invalida. Ingrese un numero positivo.");
                }

                else
                {
                    break;
                }
            }

            else
            {
                System.out.println("Entrada invalida. Ingrese un numero.");
                lectura.next();
            }
        }

        return monto;
    }
}