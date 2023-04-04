/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootaiping;

/**
 *
 * @author LENOVO
 */
public class DayVisit extends ZooTaiping {
    public String category;
    
    //This is normal constructor for DayVisit
    public DayVisit(String name, String ic, boolean govServ, String cat){
        super (name,ic,govServ);
        category = cat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public double totalCharge()
    {
        double total = 0.00;
        double feeadult = 25.00;
        double feekid = 15.00;
        if (getCategory().equalsIgnoreCase("Adult"))
        {
            if (super.isGovServant() == true)
            {
                total= feeadult * 0.85;
            }
            else if(super.isGovServant() == false)
            {
                total= feeadult;
            }
            
        }
        else if (getCategory().equalsIgnoreCase("Kid"))
        {
                total= feekid;
            }
            
            return total;
  
        }
        
    
    @Override
    public String toString(){
        return super.toString();
    }

    }

