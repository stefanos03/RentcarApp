/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcarapp;

import java.text.DecimalFormat;

/**
 *
 * @author Dell
 */
public class HireCustomer {
    private String customerName;
    private final int age;
    private double deposit;
    
    public HireCustomer(String name,int age){
        this.customerName=name;
        this.age=age;
       
    }
    //Constructor for HireCustomer objects
    public HireCustomer(String name,int age,double balance){
        this.customerName=name;
        this.age=age;
        this.deposit=balance;
        
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public double getDeposit() {
        return deposit;
    }
    //increaseee
    public void increaseDeposit(double amount){
       this.deposit+=amount;
        
       
    }
    //for now we have a error bc we dont have the getprice class in vehicles
public boolean sufficientDeposit (Vehicle v,int d){
   return this.deposit >=v.getPrice(d); 
}
    @Override
    public String toString() {
        return "Customer:" + customerName + ", age: " + age + ", deposit $" + new DecimalFormat("0.00").format(deposit);
    }
    //test
    public static void main(String[] args) {
        HireCustomer v= new HireCustomer("George",24,0.5);
        System.out.println(v);
        //test1
        v.increaseDeposit(20.0);
       
        System.out.println(v);
        //test2
         v.increaseDeposit(40);
         System.out.println(v);
    }
    
}
