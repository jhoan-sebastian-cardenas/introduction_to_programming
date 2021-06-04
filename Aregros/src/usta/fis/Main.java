package usta.fis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int counter=0;
        float v_sum=0;
        double v_total_porcent=0;
        System.out.println("cuantas notas quieres calcular:");
        int v_notes= keyboard.nextInt();
        while (v_notes<=0){
            System.err.println("ERR:el numero dijitado no es correcto");
            v_notes=keyboard.nextInt();
        }
        float [] p_array_or_vector=new float[v_notes];
        for (counter=0;counter < p_array_or_vector.length;counter++){
            System.out.println("digite su nota "+(counter+1));
            p_array_or_vector[counter]=keyboard.nextFloat();
            v_sum=v_sum+p_array_or_vector[counter];
        }
        System.out.println("tu promedio del corte es de: "+(v_sum/counter));
        for (counter=0;counter < p_array_or_vector.length;counter++){
            System.out.println("su nota "+(counter+1)+" de su corte es:"+p_array_or_vector[counter]);
        }
        System.out.println("tu notas en porcentage:");
        for (counter=0;counter < p_array_or_vector.length;counter++){
            v_total_porcent=p_array_or_vector[counter];
            if(counter==0){
                System.out.println("el valor de tu es: "+ (p_array_or_vector[counter]*0.1));
            }
            if (counter==1){
                System.out.println("el valor de tu es: "+ (p_array_or_vector[counter]*0.3));
            }
            if (counter<=2){
            System.out.println("el valor de tu "+(counter+1)+" es: "+(p_array_or_vector[counter]*(0.6/(p_array_or_vector.length-2))));
            }
        }



    }

}
