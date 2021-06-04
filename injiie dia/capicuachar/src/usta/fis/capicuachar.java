package usta.fis;

import java.util.Scanner;

public class capicuachar {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        char[] chararray;
        String cadena = "";
        int counter = 0;// i
        System.out.println("this program show info about of capicua letters or number ENTER to end ");
        cadena = Keyboard.next();
        System.out.println("the analisis result of the sthing is: " + capicuaAnswer(cadena));
        System.out.println("the sum is: "+capicuaSum(cadena));


    }

    public static String capicuaAnswer(String cadena) {
        if (capicuamethod(cadena) == true) {
            return "es capicua";
        } else {
            return "No es capicua";
        }

    }

    public static boolean capicuamethod(String cadena) {
        char[] chararray;
        chararray = new char[cadena.length()];
        chararray = cadena.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] != chararray[chararray.length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

    public static String capicuaSum(String cadena) {
        char[] chararray;
        chararray = new char[cadena.length()];
        chararray = cadena.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] != chararray[chararray.length - (i + 1)])
                cadena = String.valueOf(chararray[i] + chararray[chararray.length - (i + 1)]);

        }
        return cadena;
    }
}