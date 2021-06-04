package usta.fis;

import java.util.Scanner;

class Calculator{

    public static void main(String[] args){
        int num1=0;
        int num2=0;
        int result=0;
        int operationtoDo=0;

        Scanner keyboad = new Scanner(System.in);
        programInfo();
        System.out.println("please type the aritmetic operation: 1to add, 2 to subtract, 3 multiply, 4 divide, 5 Prime number: ");
        operationtoDo = keyboad.nextInt();
        System.out.println("please type the first number: ");
        num1 = keyboad.nextInt();
        System.out.println("please type the second number: ");
        num2 = keyboad.nextInt();
        result=operationCalc(num1,num2,operationtoDo);
        System.out.println("the result is :" +result);
    }
    public static int operationCalc(int num1, int num2, int operation, String result){
        if (operation==1){
            return num1+num2;
        }
        if (operation==2){
            return num1-num2;
        }
        if (operation==3){
            return num1*num2;
        }
        if (operation==4&& num2!=0){
            return num1/num2;
        }
        if (operation==5){
            result = operationPrim(num1);
        }
        return 0;

    }
    public static String operationPrim(int num1){
        int a=0,i;
        for ( i = 1; i <= num1; i++) {
            if (num1%i==0){
                a++;
            }
        }
        if (a!=2){
            return "no es numero par";
        }else{
            return "es numero par";
        }
    }

    public static void programInfo(){
        System.out.println("Description: This program is a calculator to add substract, multiply and divide 2" +
                "integer numbers");
        System.out.println("Autor: Jhoan Sebastian Cardenas");
        System.out.println("Date: 07-05-2021");
    }
}
