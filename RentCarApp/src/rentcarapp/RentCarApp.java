/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcarapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    //so as not to have to enter several cehicles each time,load some load 
    //Menu for managing a list of vehicles and hiring them 
    int v=0;
    
    do{
        String text = "Manage Vehicles for Hire: " //+ user.getCustomerName()
                    + "\n\nPlease select an option [1, 2, 3, 4, 5 or 0 to exit]:\n"
                    + "[1] Add a self-drive car\n"
                    + "[2] Add a car with driver\n"
                    + "[3] Add a van\n"
                    + "[4] Summarise all Vehicles\n"
                    + "[5] Enter Customer Details and Hire a Vehicle\n"
                    + "[0] Close the System";
        v=Integer.parseInt( JOptionPane.showInputDialog(text));
        
        switch(v){
            
            case 1:
            case 2:{
                String model =JOptionPane.showInputDialog("Enter car model name");
                double cost =Double.parseDouble(JOptionPane.showInputDialog("Enter Cost per day of hiring a"+model));
                if(v==1) currentVehicle = new Car(model,cost,true);
                vehicles.add(currentVehicle);
                JOptionPane.showMessageDialog(null,"Car added: \n"+currentVehicle.toString());
                break;
            }
            case 3:{
                String model =JOptionPane.showInputDialog("Enter Van name");
                double cost =Double.parseDouble(JOptionPane.showInputDialog("Enter Cost per day of hiring a"+model));
                int c=0;
                do{
                    
                   try{
                       c=Integer.parseInt(JOptionPane.showInputDialog("Enter van capacity 1-20 tons"));
                       
                   }catch(Exception e){
                       
                   }
                }while(c < 1 || c>20);
                    currentVehicle = new Van(model, cost, c);
                    vehicles.add(currentVehicle);
                    JOptionPane.showMessageDialog(null,
                            "Van added:\n" + currentVehicle.toString());
                break;
            }
            case 4:{
                String message = "There are " + vehicles.size() 
                            + " vehicles:\n";
                    for(Vehicle d: vehicles){
                        message += d.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,message);
                break;
            }
            case 5:{
                try {
                        String name = JOptionPane.showInputDialog(
                                "Enter Customer name");
                        int age = Integer.parseInt(JOptionPane.showInputDialog(
                                "Enter Customer age"));
                        //double deposit = Integer.parseInt(JOptionPane.showInputDialog("Enter Customer deposit"));
                        cust = new HireCustomer(name, age, 100);
                        int days = Integer.parseInt(JOptionPane.showInputDialog(
                                "Enter number of days"));
                        hire = new Hire(currentVehicle, cust, days);
                        JOptionPane.showMessageDialog(null,
                            "Details of hire:\n" + hire.toString()+ "\n" 
                                    + "Cost will be £" + hire.costofHire());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Unsuccessful:\n");
                    }
                break;
            }
            
            
            
        }
        
        
    }while(v!=0); 
    JOptionPane.showMessageDialog(null, "Thanks for using the system"+cust.getCustomerName()+".Goodbye");
    }
    public static void load(ArrayList<Vehicle> list){
        list.add(new Car("VW Golf", 50.0, true));
        list.add(new Car("Bently", 120.0, false));
        list.add(new Van("Transit van", 40.0, 2));
        list.add(new Van("Large Van", 90.0, 12));       
    }
}
