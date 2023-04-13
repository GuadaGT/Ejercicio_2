package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double litros = pedirInformacion(sc, "Introduzca el numero de litros consumidos: ");
        double km = pedirInformacion(sc, "Introduzca ls cantidad de kilómetros recorridos: ");

        double gasto = calcularGasto(litros, km);

        mostrarResultado(gasto);
    }

    public static double pedirInformacion(Scanner input, String mensaje) {
        System.out.print(mensaje);
        return input.nextDouble();
    }

    public static double calcularGasto(double litros, double km) {
        return litros / km * 100;
    }

    public static void mostrarResultado(double gasto) {
        String conclusion;
        if (gasto < 4) {
            conclusion = "Gasta como un mechero";
        } else if (gasto < 6) {
            conclusion = "Poco";
        } else if (gasto < 8) {
            conclusion = "Normal";
        } else if (gasto < 10) {
            conclusion = "No lo uses demasiado";
        } else {
            conclusion = "Cambia de coche";
        }
        System.out.println("Su gasto indica que " + conclusion);
    }
}
