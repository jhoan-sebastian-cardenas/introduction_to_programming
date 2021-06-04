package co.edu.usta.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float height;
    private int doorsNumber;
    private int wheelsNumber;
    private String plates;
    private  char[][] place;
    // setter and getter methods
    //set ----> poner, estableser,
    //get ----> optener

    public void setServiceType(String serviceTypeValue){
        serviceType=serviceTypeValue;
    }
    public String getServiceType(){
        return serviceType;
    }
    public void setColor(String colorValue){
        color=colorValue;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brandValue){
        brand=brandValue;
    }
    public String getBrand(){
        return brand;
    }
    public void setWidth (float widthValue){
        width=widthValue;
    }
    public float getWidth(){
        return width;
    }
    public void setHeight (float heightValue){
        height=heightValue;
    }
    public float getHeight(){
        return height;
    }
    public void setDoorsNumber(int doorsNumberValue){
        doorsNumber=doorsNumberValue;
    }
    public int getDoorsNumber (){
        return doorsNumber;
    }
    public void setWheelsNumber(int wheelsNumberValue){
        wheelsNumber=wheelsNumberValue;
    }
    public int getWheelsNumber(){
        return wheelsNumber;
    }
    public void setPlates (String platesValue){
        plates=platesValue;
    }
    public String getPlates (){
        return plates;
    }
    public void createPlacesArray(String rows){
        int rowsint=Integer.parseInt(rows);
        place=new char[rowsint][4];
    }

    public boolean initPlacesArray() {
        boolean letters = true;
        //tris instruction  is do it for rows
        for (int i = 0; i < place.length; i++) {
            //tris instruction loop the columns
            for (int j = 0; j < place[0].length; j++) {
                if (letters == true) {
                    place[i][j] = 'D';
                } else {
                    place[i][j] = 'X';
                }
            }
            if (letters == true) {
                letters = false;
            } else {
                letters = true;
            }
        }
        return letters;
    }
    public String arrayToshow(){
        String returnString="";
        for (int i = 0; i <place.length ; i++) {
            for (int j = 0; j <place[0].length ; j++) {
                returnString=returnString+place[i][j]+ " ";
            }
            returnString=returnString+"\n";
        }
        return returnString;
    }
    public String fillplace(String row, String columns){
        int rowint=Integer.parseInt(row);
        int columsint=Integer.parseInt(columns);
        if (place[rowint][columsint]=='X'||place[rowint][columsint]=='O');{
            return "the place is unavailable";
        }else{

            place[rowint][columsint]='O';
            return "the place successfully filled";
        }
    }
}


