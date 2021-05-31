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
public class Hire {
    private Vehicle vehicle;
    private HireCustomer customer;
    private int days;
    private static double driverCostPerDay=100.00;
    
    public Hire(Vehicle v, HireCustomer c,int d){
       this.vehicle=v;
       this.customer=c;
       this.days=d;
    }

    public static double getDriverCostPerDay() {
        return driverCostPerDay;
    }

    public static void setDriverCostPerDay(double driverCostPerDay) {
        Hire.driverCostPerDay = driverCostPerDay;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public HireCustomer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Hire: " + this.vehicle+"by customer: "+customer.getCustomerName()+"for"+this.days +" days";
    }
    public double costofHire(){
      return this.vehicle.getPrice(days);
    }
}
