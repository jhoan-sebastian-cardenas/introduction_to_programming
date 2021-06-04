package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int serie =0;
        int i = 0;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("dijite el numero limite para calcular la secuencia fibonacci:");
        serie= keyboard.nextInt();
        int fibo_array[]= new int[100];
        fibo_array=serie_fibonacci(serie);
        System.out.println("la secuencia fibonaccia del numero " + serie +" es: ");
        while (fibo_array[i]!=-1){
            if (fibo_array[i+1]!=-1){
                System.out.println(fibo_array[i]+", ");
            }else {
                System.out.println(fibo_array[i]);
            }
            i++;
        }
    }
    public static int[] serie_fibonacci(int limit){
        int i=1;
        int fibo_array[]= new int[100];
        fibo_array[0]=0;
        fibo_array[1]=1;
        while (fibo_array[i-1]+fibo_array[i]<limit){
            fibo_array[i+1] = fibo_array[i-1]+fibo_array[i];
            fibo_array[i+2]=-1;
            i++;
        }
        return fibo_array;
    }
    }

