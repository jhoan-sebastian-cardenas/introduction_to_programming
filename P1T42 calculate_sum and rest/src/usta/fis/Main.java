package usta.fis;
// AUTOR: Jhoan Sebastian cardenas
// DATE: 15/04/2021
// DESCRIPTION: this software is for calculate the sum or rest of two number
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        int v_num1=0;
        int v_num2=0;
        int v_operation=0;
        do {
            System.out.println("pon 1 si quieres sumar, 2 si quieres restar, 3 si quieres multiplicar,"+
                    "4 si quieres dividir,5 para numeros primos, 6 para numero  y 0 si quiere salir:");
            v_operation = keyboard.nextInt();
            if (v_operation == 0){
                System.exit( 0);
            }
            System.out.println("por favor ingrase el numero que quiere calcular.");
            System.out.println("ingresa en primer numero:");
            v_num1 = keyboard.nextInt();
            if (v_operation>0 && v_operation<5){
                System.out.println("ingresa el segundo numero:");
                v_num2 = keyboard.nextInt();
            }
            System.out.println("el resultado es: "+p_user_operation(v_num1,v_num2,v_operation));
        } while (v_operation !=0 );

    }
    public static String p_user_operation(int v_num1, int v_num2, int v_operation) {
        int v_result = 0;
        String v_convert = "";
        switch (v_operation) {
            case 1 -> v_result = v_num1 + v_num2;
            case 2 -> v_result = v_num1 - v_num2;
            case 3 -> v_result = v_num1 * v_num2;
            case 4 -> v_result = v_num1 / v_num2;
            case 5 -> {
                v_convert = "Es numero primo";
                if (p_validate_prime_number(v_num1)) {
                    v_convert = "no es un numero primo";
                }
            }
            case 6 -> v_convert = "los numero primos son: " + p_prime_number(v_num1);
            default -> {
                v_convert = "EXIT";
                System.exit(0);
            }
        }
           if (v_convert.isEmpty()){
               v_convert=String.valueOf(v_result);
           }
            return v_convert;//metodo 2: v_result+"";//metodo 3:Integer.toString(v_results)
        }
    public static String p_prime_number(int v_limit){
        String prime_numbers="";
        int p_pos_counter=0;
        int[]int_prime_numbers=new int[100];
        for (int counter = 1; counter <= v_limit; counter++){
            if (p_validate_prime_number(counter)){
                prime_numbers=prime_numbers+String.valueOf(counter)+", ";
                
            }

        }

        return prime_numbers;

    }
    public static boolean p_validate_prime_number(int v_prime){

        int numbers_divide=0;
        for (int i=1;i<=v_prime;i++){
            if (v_prime%i ==0){
                numbers_divide++;
            }
        }
        if (numbers_divide!=2){
            return false;
        }
        return true;

    }
    public static void p_show_info_program(){
        System.out.println("------------------------------------------------------");
        System.out.println("-----------SoftCalculatesumandrest V1.0---------------");
        System.out.println("-------Maker: Jhoan Sebastian Cardenas Bravo----------");
        System.out.println("----------------Date: 26 MARCH 2021-------------------");
        System.out.println("------------------------------------------------------");
    }
}

