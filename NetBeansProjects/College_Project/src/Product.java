/**
 *
 * @author sahibnoorsingh
 */
public class Product 

{
    
    private int id;
    private String name;
    private int mobileno;
    private String email;
    private String city;
    private String inward_challan;
    private String item;
    private String Defect;
    private String addDate;
    private byte[] picture;

 
    
    
   

   /* public void Product (int pid, String pname,int pmobileno, String pemail, String pcity, int ppincode,
            String pinward_challan,String pitem, String pdefect,String pAddDate,byte[] pimg)
    {
  this.id=pid;
    this.name=pname;
    this.mobileno=pmobileno;
    this.email=pemail;
    this.city=pcity;
    this.pincode=ppincode;
    this.inward_challan=pinward_challan;
    this.item=pitem;
    this.Defect=pdefect;
    this.addDate=pAddDate;
    this.picture=pimg;
    

    }**/

  

 Product (int pid, String pname,int pmobileno, String pemail, String pcity,
            String pinward_challan,String pitem, String pdefect,String pAddDate,byte[] pimg)
    {
       
     this.id=pid;
    this.name=pname;
    this.mobileno=pmobileno;
    this.email=pemail;
    this.city=pcity;
    this.inward_challan=pinward_challan;
    this.item=pitem;
    this.Defect=pdefect;
    this.addDate=pAddDate;
    this.picture=pimg;
    }

    
    
   
   

    

    
    public int getId()
    {
        return id;
    }
 

    public String getName()
        {
    
    return name;
        }

public int getmobile()
    {
    return mobileno    ; 
        
    }   
    public String getemail()
    {
    return email;
    }
    
    public String getcity()
    {
    return city; 
    }
 
    
    
    public String inward_challan()
    {
    return inward_challan;
    }
    
    
    public String item()
    {
    return item;
    }
    
    
    public String Defect()
    {
    return Defect;
    }
    
    public String AddDate()
    {
    return addDate;
    }

 
public byte[] getImage()
{
return picture;
}


};   


    
    

