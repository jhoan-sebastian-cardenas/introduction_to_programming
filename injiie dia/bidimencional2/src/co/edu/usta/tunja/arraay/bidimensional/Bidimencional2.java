package co.edu.usta.tunja.arraay.bidimensional;

import java.util.Scanner;

public class Bidimencional2 {
    public static void main(String [] args){
        int rows=5, columns=4;
        Scanner keyboard=new  Scanner(System.in);
        int [][] matrix=new int[rows][columns];
        System.out.println("please type the values for the bidimencinal array (matrix)");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print("this value will locate in matriz["+i+"]["+j+"]=");// matrix[i][j]
                matrix[i][j]=keyboard.nextInt();
            }
        }
        System.out.println("\n the value in order of the matrix are: \n");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print(" "+matrix[i][j]+" ");//matrix [0][1]
                if (matrix[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.print("");
        }

    }
}
