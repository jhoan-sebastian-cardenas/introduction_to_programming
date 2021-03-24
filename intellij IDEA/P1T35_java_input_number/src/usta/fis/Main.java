package usta.fif;
//AUTHOR:  Sebastian Cardenas
//DATE: 2021-march_16
//DESCRIPTION:this software show variable that input by keyboard

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("--------------------");
	System.out.println("softInputNum version 1.0");
	System.out.println("maker:sebastian Cardenas");
	System.out.println("--------------------");
	Scanner keyboard = new Scanner(System.in);

 int v_number1, v_number2, v_sum;
		System.out.println("input the first number");
		v_number1= keyboard.nextInt();
		System.out.println("input the second number");
		v_number2= keyboard.nextInt();
		v_sum= v_number1+v_number2;
		System.out.println("the total sum is : " + v_sum);

    }
}
