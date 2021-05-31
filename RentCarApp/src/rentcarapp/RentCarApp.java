/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcarapp;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RentCarApp {

  
    public static void main(String[] args) {
         HireCustomer cust ;
    cust= new HireCustomer("Stefan",27,25.0);
    Vehicle currentVehicle = new Car("VW",50.0,true);
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(currentVehicle);
    Hire hire;
    }
    
}
