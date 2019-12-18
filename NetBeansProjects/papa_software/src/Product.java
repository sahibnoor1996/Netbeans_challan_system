/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahibnoorsingh
 */
public class Product 

{

   
    
 
    private String item_name;
    private String serial_no;
    private String quantity;
    private String price;
    private String item_date;


 
    
    

 Product  (String item_name, String serial_no,String quantity,String price,String item_date)
    {
       
  
    this.item_name=item_name;
    this.serial_no=serial_no;
    this.quantity=quantity;
    this.price=price;
    this.item_date=item_date;

   
    }


    

    
  
   
    
 public String getitem_name()
    {
    return item_name; 
    }
 
    public String getserial_no()
    {
    return serial_no;
    }
    
     public String getquantity()
    {
    return quantity;
    }
    
    public String getprice()
    {
    return price;
    }
    
    public String getdate()
    {
        return item_date;
    }
   
   

};   
