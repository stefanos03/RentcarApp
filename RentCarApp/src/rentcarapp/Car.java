/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcarapp;

/**
 *
 * @author Dell
 */
public class Car extends Vehicle {
private boolean selfDrive;
    public Car(String desc,double cost,boolean self){
        super(desc,cost);
        this.selfDrive=self;
        
    }
    public Car(Model mod, double cost,boolean self) {
        super(mod.name(), cost);
        this.selfDrive=self;
    }

    public boolean isSelfDrive() {
        return selfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        this.selfDrive = selfDrive;
    }

    @Override
    public String toString() {
        String message= "Car: "+super.toString();
        if(selfDrive) message+="Self-Drive";
        else message +="With Driver";
                return message;
    }

@Override
 public double getPrice(int d){
     if(this.selfDrive)return this.getCostPerDay()*d;
     return(this.getCostPerDay()+ Hire.getDriverCostPerDay())*d; //first we need to inisl the Hire Class
 } 
 //test
    public static void main(String[] args) {
        Car d= new Car(Model.FERRARI,2.5,false);
        System.out.println(d);
    }
}
