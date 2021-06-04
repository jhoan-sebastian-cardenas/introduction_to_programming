package co.edu.usta.tunja.dimenciolanarray;

import javax.swing.*;

public class bidimensional {
    // this program declare a size of a bidimensional array designed by user
    public static void main(String[] args) {
        int [][] matrix;
        int value, biggestNamber, lengthBiggestNumber;
        String columns, rows, input;

        columns= JOptionPane.showInputDialog("this program create dynamic bidimensional array, " +
                "\n please type the size of columns ");
        rows=JOptionPane.showInputDialog("please type the size of columns: ");
        matrix=new int[Integer.parseInt(rows)][Integer.parseInt(columns)];
        JOptionPane.showMessageDialog(null,"please type the values"+
                "for the bidimensinal array of: "+rows+"rows and "+columns+"columns");

        for (int i = 0; i <Integer.valueOf(rows) ; i++) {
            for (int j = 0; j <Integer.valueOf(columns) ; j++) {
                input=JOptionPane.showInputDialog("please type the value array["+i+"]["+j+"]=");
                value=Integer.parseInt(input);
                matrix[i][j]=value;
            }
        }
        // mostrar lo que tenemos en el matrix
        biggestNamber=findBiggestValueInMatrix(matrix);
        lengthBiggestNumber=countDigitsNumber(biggestNamber);

    }
    public static int findBiggestValueInMatrix(int [][] matrix){
        int bigget=matrix[0][0];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (bigget<matrix[i][j]){ //verify if value storage in the matrix is biggest
                    //that value storage in the variable
                    bigget=matrix[i][j];
                }
            }
        }
        return bigget;
    }
    public static int countDigitsNumber(int myNumber){
        String value =String.valueOf(myNumber);
        return value.length();

    }

}

