/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcarapp;

import java.text.DecimalFormat;

/**
 *
 * @author Dell
 */
public abstract class Vehicle {
private String description;
private double costPerDay;
private int mileage;
private boolean available;

public Vehicle(String descr,double cost){
    this.description=descr;
    this.costPerDay=cost;
    this.mileage=0;
    this.available= true;
}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public int getMileage() {
        return mileage;
    }
    
    //update
    public boolean updateMileage(int m){
        if(m<=this.mileage)
            return false;
               this.mileage=m;
      return true;
            
        
    }

    public boolean isAvailable() {
        return available;
    }
    
    public void inUse(){
        this.available=false;
    }

    public void nowAvailable(){
        this.available=true;
    }

    @Override
    public String toString() {
        return  description + "   Mileage =  "+this.getMileage()+"cost per day:  "+new DecimalFormat("0.00").format(this.costPerDay)+"Available:"+this.available;
    }
    
    public abstract double getPrice(int pr);
    
    //test
    public static void main(String[] args) {
        
   Vehicle m = new Vehicle("Volve",2.500) {
            @Override
            public double getPrice(int pr) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(m);
    }
       
    
    
}
