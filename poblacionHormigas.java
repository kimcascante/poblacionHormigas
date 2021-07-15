package Semana6;

/**
 * Nombre del programa: 
 * Descripcion:  En la isla del Edén vive una gran cantidad de hormigas que se reproducen a una tasa
    del 40% mensual; 
    
    en la isla existe además un oso hormiguero que se come 7000 hormigas al final de cada mes (o todas las hormigas que haya si la población de
    hormigas en ese momento es inferior a 7000). 
    
    Cuando la población de hormigas de la isla sobrepasa el máximo de 28000, comienza a haber problemas de alimentación lo
    que hace que se reduzca la tasa de crecimiento al 31% mensual. 
    
    El muestreo de la población se hace mensualmente, al final de cada mes. 
    
    Haga el modelaje y el algoritmo que reciba como entrada el número de hormigas que hay en un momento
    dado en la isla y un número entero X, y calcule la población de hormigas después de
    esos X meses

 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej6w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {

        int numeroHormigas;
        int meses;

        double poblacion = 0;
        double contadorPoblacion = 0;

        escribir.println("Digite la cantidad de hormigas:");
        numeroHormigas = Integer.parseInt(leer.readLine());

        escribir.println("Digite los meses:");
        meses = Integer.parseInt(leer.readLine());

        for (int count = 0; count < meses; count++) {

            if (count == 0 && numeroHormigas < 28000) {
                poblacion = numeroHormigas + (numeroHormigas * 0.4);
                contadorPoblacion = contadorPoblacion + poblacion;

            } else if (count == 0 && numeroHormigas > 28000) {
                poblacion = numeroHormigas + (numeroHormigas * 0.31);
                contadorPoblacion = contadorPoblacion + poblacion;

            } else if (count != 0 && contadorPoblacion < 28000) {
                contadorPoblacion = contadorPoblacion + (contadorPoblacion * 0.4);

            } else if (count != 0 && contadorPoblacion > 28000) {
                contadorPoblacion = contadorPoblacion + (contadorPoblacion * 0.31);

            }

            if (contadorPoblacion > 7000) {

                contadorPoblacion = contadorPoblacion - 7000;

            } else {
                contadorPoblacion = 0;

            }

            escribir.println(contadorPoblacion);

        } // Fin del for

        escribir.println ("El total de hormigas en un lapso de " +meses+ " meses, es de " +contadorPoblacion);

    }// Fin del Main
}// Fin de la clase