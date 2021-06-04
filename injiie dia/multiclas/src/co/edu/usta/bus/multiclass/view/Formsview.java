package co.edu.usta.bus.multiclass.view;

import co.edu.usta.bus.multiclass.logic.Vehicle;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;

public class Formsview {
    private static Vehicle myvehicle;
    //create a program that do it manage the bus please with difference X for unavailable, D available, O for busy.
    // the bus have 4 columns bu the numbers of rows must be specified by the drive
    public static void main(String[] params) {
        myvehicle= new Vehicle();
        int DoorsNumber = 0,WheelsNumber=0, valueConfirDialog=0;
        float Width = 0,Height=0;
        String value,valueColor,valueBrand,valuePlates, NumRaws,InfRaws, row,column, InfRawsColumn;

        //1. read the value number of raws
        NumRaws=JOptionPane.showInputDialog("please type the numbers of rows for him bus: ");//1.
        //1.1 create matrix with defined size
        myvehicle.createPlacesArray(NumRaws);//1.1
        //2 initialize matrix.
        myvehicle.initPlacesArray();//2
        //3.convert the array to String for easy show
        InfRaws=myvehicle.arrayToshow();
        JOptionPane.showInternalMessageDialog(null,InfRaws);
        //4. request the row
        JOptionPane.showInputDialog("Hello, for you place, please type the Row to fill:  ");
        //4. request the column
        JOptionPane.showInputDialog("Hello, for you place, please type the Column to fill:  ");
        //5.fill place as unavailable
        InfRawsColumn=myvehicle.fillplace(row,column);











        //NumRaws1=JOtionPane.showInputDialog("please type the numbers of rows for him bus: ");






/*
        value=JOptionPane.showInputDialog("please type the kind of service of your vehicle");
        myvehicle.setServiceType(value);

        myvehicle.getServiceType();
        JOptionPane.showMessageDialog(null,"the kind of service of your vehicle is: "+value);

        valueColor=JOptionPane.showInputDialog("please type the color of vehicle.");
        myvehicle.setColor(valueColor);

        myvehicle.getColor();
        JOptionPane.showMessageDialog(null,"the color of vehicle is: "+valueColor);

        valueBrand=JOptionPane.showInputDialog("please type the kind of brand of your vehicle");
        myvehicle.setBrand(valueBrand);

        myvehicle.getBrand();
        JOptionPane.showMessageDialog(null,"the kind of bland is: "+valueBrand);

        String valueWidth = String.valueOf(Width);
        valueWidth=JOptionPane.showInputDialog("please type the width of vehicle.");
        myvehicle.setWidth(Float.parseFloat(valueWidth));

        myvehicle.getWidth();
        JOptionPane.showMessageDialog(null,"the width of vehicle is: "+valueWidth);

        String valueHeight=String.valueOf(Height);
        valueHeight=JOptionPane.showInputDialog("please type the heingt of vehicle.");
        myvehicle.setHeight(Float.parseFloat(valueHeight));

        myvehicle.getHeight();
        JOptionPane.showMessageDialog(null,"the height of vehicle is: "+valueHeight);

        String valueDoorsNumber= String.valueOf(DoorsNumber);
        valueDoorsNumber=JOptionPane.showInputDialog("please type the doorsNumber of vehicle.");
        myvehicle.setDoorsNumber(Integer.parseInt(valueDoorsNumber));

        myvehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null,"the DoorsNumber of vehicle is: "+valueDoorsNumber);

        String valueWheelsNumber= String.valueOf(WheelsNumber);
        valueWheelsNumber=JOptionPane.showInputDialog("please type the wheelsNumber of vehicle.");
        myvehicle.setWheelsNumber(Integer.parseInt(valueWheelsNumber));

        myvehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null,"the wheelsNumber of vehicle is: "+valueWheelsNumber);

        valuePlates=JOptionPane.showInputDialog("pleace type the numbers of the plate of vehicle");
        myvehicle.setPlates(valuePlates);

        myvehicle.getPlates();
        JOptionPane.showMessageDialog(null,"the number of plate is: "+valuePlates);

*/








    }
}
