package usta.fis;

import java.util.Scanner;

class Bidimensional2 {

    public static void main(String[] args) {

        final int FILAS = 5, COLUMNAS = 4;
        Scanner sc = new Scanner(System.in);
        int filas,columnas, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (filas = 0; filas < FILAS; filas++) {
            for (columnas = 0; columnas < COLUMNAS; columnas++) {
                System.out.print("numero en la fila [" + filas + "] de la columna [" + columnas + "] es de = ");
                A[filas][columnas] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (filas = 0; filas < A.length; filas++) {
            for (columnas = 0; columnas < A[filas].length; columnas++) {
                System.out.print(A[filas][columnas] + " ");
            }
            System.out.println();
        }
    }
}
