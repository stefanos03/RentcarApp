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
public class Van extends Vehicle{
    private final int capacity;
    private static double largeCost=30;
    public Van(String d,double cost,int cap){
       super(d,cost);
       this.capacity=cap;
       
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Van: "+ super.toString()+"Load Capacity: "+this.capacity+" t";
    }

    public static double getLargeCost() {
        return largeCost;
    }

    public static void setLargeCost(double largeCost) {
        Van.largeCost = largeCost;
    }

    @Override
  public double getPrice(int days){
      if(this.capacity>10)return days*(this.getCapacity()+largeCost);
      else return days*(this.getCostPerDay());
  }
    
}
