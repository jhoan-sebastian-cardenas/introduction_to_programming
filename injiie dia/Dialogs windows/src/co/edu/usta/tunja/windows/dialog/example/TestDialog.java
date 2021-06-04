package co.edu.usta.tunja.windows.dialog.example;
import javax.swing.*;
import java.awt.*;
import java.util.jar.JarOutputStream;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TestDialog {
    public static void main(String[] args) {
        // ejercicion del metodo showMessageDialog
        // Primer ejercicio
        //JOptionPane.showMessageDialog(null,"Operacion realizada correctamente");
        // Segundo ejercicio
        //JOptionPane.showMessageDialog(null,"ERR:el programa no se puede ejecutar.","ALERT", JOptionPane.ERROR_MESSAGE);
        // Tercer ejercicio
        //class MyIcon implements Icon {
        // @Override
        // public void paintIcon(Component c, Graphics g, int x, int y) {
        // Image image = new ImageIcon(getClass().getResource("resources/icono-png.PNG")).getImage();
        // g.drawImage(image, x, y, c);
        // }

        //   @Override
        //    public int getIconWidth() {
        //return 50;
        //   }

        //   @Override
        // public int getIconHeight() {
        //     return 50;
        // }


        // }
        //// MyIcon icon = new MyIcon();
        //JOptionPane.showMessageDialog(null, "Bienbenido", "UNIVERCIDAD SANTOTO", JOptionPane.DEFAULT_OPTION, icon);

        //EJERCICIO DEL METODO showInputDialog
        //Primer ejercicio
        //String respuesta= JOptionPane.showInputDialog("como te llamas");
        // Segundo ejercicio
        //JOptionPane.showInputDialog("cual es su nombre.","Jhoan Sebastian");
        //tercer ejercicio
        //JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
        //cuarto ejerciico
        //JOptionPane.showInputDialog(null,"cual es su nombre.","Jhoan Sebastian");
        // quinto ejercicio
        //JOptionPane.showInputDialog(null,"Por favor ingresa nuevamente tu ni","ERR1!", JOptionPane.ERROR_MESSAGE);

        String answer;
        int amount = 0, operation = 0, result=0;
        int[] arrey;
        answer = JOptionPane.showInputDialog("Hi, this program is a calculator" +
                "\n and do it a arithmetic operation" +
                "\n please type the amount of numbers that you will usw");
        amount = Integer.valueOf(answer);
        arrey = new int[amount];
        answer = JOptionPane.showInputDialog("please type: \n 1 to sum \n 2 to  substract \n 3 multiply \n divide, or ");
        operation = Integer.valueOf(answer);
        //llamr un metodo
        for (int i = 0; i < amount; i++) {
            answer = JOptionPane.showInputDialog("please type the " + (i + 1) + "number");
            arrey[i] = Integer.valueOf(answer);
        }
        result = calculator(arrey, operation);
        JOptionPane.showMessageDialog(null, "hi, your answer was: " + answer);
    }

    public static int calculator(int[] arrey, int operation) {
        int result = 0;
        for (result = 0; result < arrey.length; result++) {
            result=operation+arrey.length;
        }
        return result;
    }



}


