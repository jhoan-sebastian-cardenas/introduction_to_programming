package usta.fis;
//AUTHOR: Jhoan Sebastian cardenas
//DATE: 23_march_2021
//DESCRIPTION: this software calculate time between two cities

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        float v_time=0;
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("the time  between two cities is "+v_time+" hours ");
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
    public static int p_user_distance(){
        Scanner keyboard = new Scanner(System.in); // use la variable keyboard como distancia para el teclado
        int v_distance;
        System.out.println("input/type distance (Kg) between two cities");
        v_distance= keyboard.nextInt();// pidiendo por teclado la variable de v_distance
        while (v_distance<0){
            System.err.println("ERR: the distance should be greater that zero, input/type again distance (Kg) between two cities:");
            v_distance= keyboard.nextInt();// pidiendole por teclado la variable de v_distance
        }
        return v_distance;
    }
    public static int p_user_velocity(){
        //DESCRIPTION: this method return the VELoCITY that user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/type the constance velocity (kg/H) between two cities");
        int v_velocity = keyboard.nextInt();
        while (v_velocity == 0){
            System.err.println("ERR: the velocity cannot be same zero, input again the velocity (Kg/H):");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}

