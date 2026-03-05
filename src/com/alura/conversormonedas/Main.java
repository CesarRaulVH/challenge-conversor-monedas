package com.alura.conversormonedas;

import com.alura.conversormonedas.service.ConversorService;

public class Main
{
    public static void main(String[] args)
    {
        boolean salir = true;
        int opcion = 0;
        double montoInicial = 0;
        double montoFinal = 0;
        String monedaBase = "";
        String monedaDestino = "";

        ConversorService conversor = new ConversorService();

        while(salir)
        {
            opcion = conversor.imprimirMenu();

            switch(opcion)
            {
                case 1:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "USD";
                    monedaDestino = "ARS";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 2:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "ARS";
                    monedaDestino = "USD";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 3:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "USD";
                    monedaDestino = "BRL";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 4:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "BRL";
                    monedaDestino = "USD";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 5:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "USD";
                    monedaDestino = "COP";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 6:
                {
                    montoInicial = conversor.obtenerMontoInicial();
                    monedaBase = "COP";
                    monedaDestino = "USD";

                    montoFinal = conversor.convertir(monedaBase, monedaDestino, montoInicial);

                    System.out.println(montoInicial + monedaBase + " -> " + montoFinal + monedaDestino);

                    break;
                }

                case 7:
                {
                    salir = false;

                    break;
                }

                default:
                {
                    System.out.println("Opcion invalida. Ingrese una opcion valida.");
                    break;
                }
            }
        }

        System.out.println("Terminando programa...");
    }
}