package co.edu.usta.tunja.Taller2;

import javax.swing.*;

public class busarray {
    public static void main(String[] args) {
        char [][] matrix;
        String filas,columa;
        filas=JOptionPane.showInputDialog(" porfavor ingresar " +
                "\n el numero de filas que tiene el bus");

        matrix=new char[Integer.parseInt(filas)][4];

        for (int i = 0; i < Integer.valueOf(filas); i++) {
            for (int j = 0; j < 4; j++) {
                if(i %2==0)
                    matrix[i][j]= 'X';
                else
                    matrix[i][j]= 'D';
            }
        }
        JOptionPane.showMessageDialog(null,contbus(matrix));
    }
    public  static String contbus(char [][] matrix){
        String Return=" ";
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                Return=Return + String.valueOf(matrix[i][j])+" ";
            }
            Return= Return + " \n ";

        }
        return Return;

    }
}
