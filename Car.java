public class Car{
    private String model;
    private String chasisNumber;
    private double cost;
    public void setModel(String model){
        this.model =model;
    }
    public void setChasisNumber(String chasisNumber){
        this.chasisNumber = chasisNumber;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
   
    public  String showData(){
        String data = " The car is " + model + ", model, and "+ chasisNumber+" chasis number";
        return data;
    }
    public static void main(String args[]){
        Car c1 = new  Car();
        c1.setModel("Alto");
        c1.setChasisNumber("ASDF1234");
        c1.setCost(350000);
        System.out.println(c1.showData());
    }//main ends

}