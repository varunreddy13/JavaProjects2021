/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

/**
 *
 * @author S545158 /Varun Reddy Musku
 */
public class Starbucks {
    
    
    private String customerName;
    private String address;
    private String contactNumber;
    private String customerType;
    private  String billReciept=" ";
    private  double billAmount = 0;
    private  String order = " ";

    public Starbucks(String customerName, String address, String contactNumber, String customerType) {
        this.customerName = customerName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getBillReciept() {
        return billReciept;
    }

    public void setBillReciept(String billReciept) {
        this.billReciept = billReciept;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
    public String getNameInitials()
    {
      int i = customerName.indexOf(' ');
    String name=customerName.toUpperCase().charAt(0)+"."+customerName.toUpperCase().charAt(i+1)+".";
    
    while (i >= 0) {           
        
        i = customerName.indexOf(' ', i + 1);        
        if(i!=-1){
        name=name+customerName.toUpperCase().charAt(i+1)+".";
        }
    }
    return name;
       
    }
    
    private String getItemName(int number) 
            
            {
               		String itemName;
		 switch(number){
            case 1:
                itemName="Ham & Swiss Panini";
                break;
            case 2:
               itemName="Cheese & Fruit Bistro Box";
                break;
            case 3:
                itemName="Turkey Pesto Panini";
                break;
            case 4:
                itemName="Salted Caramel or Birthday Cake Pop";
                break;
            case 5:
                itemName="Roasted Tomato & Mozzarella Panini";
                break;
            default:
                itemName="";
                break;
        
        }
		return itemName;
    
    }
    private double getItemCost(String name)
            
    {
        double cost;
	        switch(name){
            case "Ham & Swiss Panini":
                cost=5.25;
                break;
            case "Cheese & Fruit Bistro Box":
                cost=4.95;
                break;
            case "Turkey Pesto Panini":
                cost=5.96;
                break;
            case "Salted Caramel or Birthday Cake Pop":
                cost=3.50;
                break;
            case "Roasted Tomato & Mozzarella Panini":
                cost=3.46;
                break;
            default:
                cost=0.0;
                break;
        
        }
		return cost;
    }
    
    
    public void updateReceipt(int quantity, int itemNumber){
        
        	    String item=getItemName(itemNumber);
        double price=getItemCost(item);
        billAmount=billAmount+price*quantity;
        
        billReciept+=item+"("+price+")"+"          *"+quantity+"="+price*quantity+"\n"; 
    
    
    
    }
    
    private double getDiscount()
    {
               double discount;
        if(customerType.equals("Regular") && billAmount>10.00) {
            
            discount=((billAmount*10)/100);
            
        
        
        }
        else
            discount=0.0;
        
    
    
    
        
        return discount;
    }
    
    private double getSalesTax()
            
    {
    
   double q=(billAmount*8)/100;
        return q;
    }
    
    
    public double getFinalBillAmount(){
    
         double o=billAmount-getDiscount()+getSalesTax();
        return o;
    }
    
    private String getFinalBillReciept(){
    
        billReciept += "                         Sales Tax = "+getSalesTax()+"\n";
        billReciept += "                         discount  = -"+getDiscount()+"\n";
        billReciept += "---------------------------------------------------\n";
        billReciept += "                    Total Bill = "+getFinalBillAmount()+"\n";
        billReciept += "---------------------------------------------------\n";
        return billReciept;
    
    }
    
    private String getOrderWithName()
    {
    
        
        return "order  -  "+ getOrder()+" by "+getNameInitials();
    
    }
    
     private String getContactDetails()
    {
    
        return "Address: "+address+"\n"+
        "Contact: "+contactNumber;
        
    
    }
    
   private String  getBalance(double value)
   {
              
    double num=value-getFinalBillAmount();
        double k=num;
        int num_50 = 0;
        int num_10=0;
        int num_5=0;
        int num_1=0;
        int num_025=0;
        int num_010=0;
        int num_005=0;
        int num_001=0;
        while(true){
            if(num>=50.00){
                num=num-50.00;
                num_50=num_50+1;
            
            }
            else if(num>=10.00){
                num=num-10;
                num_10=num_10+1;
                            
            }
            else if(num>=5.00){
                num=num-5.00;
                num_5=num_5+1;
            
            
            }
            else if(num>=1.00){
                num=num-1.00;
                num_1=num_1+1;
            
            }
            else if(num>=0.25 && num<1.00){
                
                num_025=num_025+1;
                num=num-0.25;
                
            
            }
            else if(num>=0.10){
                num_010=num_010+1;
                num=num-0.10;
                            
            }
            else if(num>=0.05){
                num_005=num_005+1;
                num=num-0.05;
            
            }
            else if(num>0.01){
                num_001=num_001+1;
                num=num-0.01;
            
            }
            else 
                break;
                
           
    
    }
        if(k>=50){
        
            return "Change received is as follow\n"+"$50.00 * "+num_50+" = "+(num_50*50.00)+"\n"+
                "$10.00 * "+num_10+" = "+(num_10*10.00)+"\n"+"$5.00  * "+num_5+" = "+(num_5*5.00)+"\n"+
                   "$1.00  * "+num_1+" = "+(num_1*1.00)+"\n"+
                           "$0.25  * "+num_025+" = "+(num_025*0.25)+"\n"+
                                   "$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        }
        else if(k>=10){
            return "Change received is as follow\n"+"$10.00 * "+num_10+" = "+(num_10*10.00)+"\n"+"$5.00  * "+num_5+" = "+(num_5*5.00)+"\n"+
                   "$1.00  * "+num_1+" = "+(num_1*1.00)+"\n"+
                           "$0.25  * "+num_025+" = "+(num_025*0.25)+"\n"+
                                   "$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else if(k>=5){
            return "Change received is as follow\n"+"$5.00  * "+num_5+" = "+(num_5*5.00)+"\n"+
                   "$1.00  * "+num_1+" = "+(num_1*1.00)+"\n"+
                           "$0.25  * "+num_025+" = "+(num_025*0.25)+"\n"+
                                   "$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else if(k>=1.00){
            return "Change received is as follow\n"+"$1.00  * "+num_1+" = "+(num_1*1.00)+"\n"+
                           "$0.25  * "+num_025+" = "+(num_025*0.25)+"\n"+
                                   "$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else if(k>0.25){
            return "Change received is as follow\n"+"$0.25  * "+num_025+" = "+(num_025*0.25)+"\n"+
                                   "$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else if(k>0.10){
            return "Change received is as follow\n"+"$0.10  * "+num_010+" = "+(num_010*0.10)+"\n$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else if(k>0.05){
            return "Change received is as follow\n"+"$0.05  * "+num_005+" = "+(num_005*0.05)+"\n$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n---------------------";
        
        }
        else if(k>0.01){
            return "Change received is as follow\n"+"$0.01  * "+num_001+" = "+(num_001*0.01)+"\n"+"--------------------\n"
                +"Total Bal  = "+(value-getFinalBillAmount())+"\n--------------------";
        
        }
        else
            return null;
        
    }
    
        

    @Override
    public String toString() {
               String s1=getOrderWithName()+"\n"+getContactDetails()+getFinalBillReciept();
        return s1;
    }
    
    public String printReciept(double paid){
    
    
       String out;
        out=toString()+getBalance(paid);
        return out;
    
    }
       


    
}
