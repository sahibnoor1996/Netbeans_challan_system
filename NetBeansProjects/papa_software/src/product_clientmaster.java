/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahibnoorsingh
 */
public class product_clientmaster {
    


    private int id;
    private String name;
    private String address;
    private String city;
    private String phone;
    private String pincode;
    private String add_Date;
    private String remarks;
      

 product_clientmaster  (int id,String name, String address,String city, String phone,String pincode, String add_Date,String remarks)
    {
       this.id=id;
    this.name=name;
    this.address=address;
    this.city=city;
    this.phone=phone;
    this.pincode=pincode;
    this.add_Date=add_Date;
    this.remarks=remarks;
    
    }

    
 public int getid()
 {
 return id;
 }
  
    public String getname()
    {
        return name;
    }
 

    public String getaddress()
        {
    
    return address;
        }

    public String getcity()
    {
    return city; 
    }  
    
    public String getphone()
    {
    return phone;
    }
    
    public String getpincode()
    {
    return pincode;
    }
    
    public String getaddDate()
    {
    return add_Date; 
    }
 
    public String getremarks()
    {
    return remarks;
    }
    
    
    
    
   
   

};   
    
    
    

