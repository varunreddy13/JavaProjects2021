/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

import java.util.Scanner;

/**
 *
 * @author S545158/ Varun Reddy Musku
 */
public class StarbucksDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 System.out.println("** Welcome to Starbucks **");
        System.out.println();
        String customerName = "";
        String order;
        int count=0;
        String address = "";
        String contactNumber = "";
        String customerType = ""; 
        do{
            Scanner consoul=new Scanner(System.in);
          count=count+1;   
        do
        {
        System.out.print("Please enter the full name (Firstname Lastname): ");
        customerName=consoul.nextLine();
        }
        while(customerName.isEmpty());
        
        do
        {
        System.out.print("Please enter the Address: ");
        address=consoul.nextLine();
        }
        while(address.isEmpty());
        
        do
        {
        System.out.print("Please enter Contact Number: ");
        contactNumber=consoul.nextLine();
        }
        while(contactNumber.length()!=10);
        
        do
        {
        System.out.print("Please enter Customer Type(Regular/New): ");
        customerType=consoul.nextLine();
        }
        while(!(customerType.equalsIgnoreCase("Regular")||customerType.equalsIgnoreCase("New")));
        Starbucks sb= new Starbucks(customerName,address,contactNumber,customerType);
      System.out.println();
      System.out.println("!!!!! Welcome Board "+customerName+" !!!!!");
      System.out.println();
        String more;
        int itemNumber;
        int quantity;
        do
        {
        System.out.println("Select items from following list\n" +
"	1.Ham & Swiss Panini\n" +
"	2.Cheese & Fruit Bistro Box\n" +
"	3.Turkey Pesto Panini\n" +
"	4.Salted Caramel or Birthday Cake Pop\n" +
"	5.Roasted Tomato & Mozzarella Panini");
        itemNumber=consoul.nextInt();
        if (itemNumber > 5) {
        System.out.println("Please choose the number 1 to 5");
        itemNumber = consoul.nextInt();
                }
        System.out.print("Enter the quantity: ");
        quantity=consoul.nextInt();
        System.out.print("Do you want to add one more item(Y/N))? ");
         System.out.print("");     
        more=consoul.next();
        sb.updateReceipt(quantity, itemNumber);
        }
        while(more.equalsIgnoreCase("Y"));
     
      sb.setOrder(Integer.toString(count));
      System.out.println("");
      System.out.println("Bill amount is "+Math.round(sb.getFinalBillAmount()
              *100)/100.00);
            double totalcash;
            do
            {
                System.out.print("Enter the cash paid: $");
                 
                totalcash=consoul.nextDouble();
                  
            }
            
            while(totalcash<sb.getFinalBillAmount());
          System.out.println("");
            System.out.println("*************");
            System.out.println(sb.printReciept(totalcash));
            System.out.println("*************");
            System.out.print("Do you want add one more order(Y/N))? ");  
            order=consoul.next();  
            System.out.println();
//            if(order.equalsIgnoreCase("N")){
//                consoul.close();
//                System.out.println("Thank you!");
//            }
            }
        while(order.equalsIgnoreCase("Y"));
         System.out.println("Thank you!");
         
       
        
    }

}
     
        
    
    
