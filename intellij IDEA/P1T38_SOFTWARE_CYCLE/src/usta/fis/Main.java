package usta.fis;
//AUTHOR: Jhoan Sebastian cardenas
//DATE: 23_march_2021
//DESCRIPTION: this software calculate time between two cities

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        p_user_distance();
    }
    public static void p_show_info_program(){
        //DESCRIPTION: this method show the  info software.
        //DATE:23-march-2021
        System.out.println("----------------------------------------------------");
        System.out.println("¡         SOFTWARETIMECYCLE VERSION 1.0            !");
        System.out.println("¡         MAKER:Jhoan Sebastian Cardenas           !");
        System.out.println("¡ DESCRIPTION:calculate time between two cities    !");
        System.out.println("----------------------------------------------------");
    }
    public static void p_user_distance(){
        Scanner keyboard = new Scanner(System.in); // use la variable keyboard como distancia para el teclado
        int v_distance;
        System.out.println("input/type distance between two cities");
        v_distance= keyboard.nextInt();// pidiendo por teclado la variable de v_distance
        while (v_distance<0){
            System.out.println("ERR: the distance should be greater that zero, input/type again distance between two cities:");
            v_distance= keyboard.nextInt();// pidiendole por teclado la variable de v_distance
        }

    }

}

