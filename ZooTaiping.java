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
public abstract class ZooTaiping {
    protected String visitorName;
    protected String icNumber;
    protected boolean govServant;
    
   
    //normal constructor
    public ZooTaiping (String name, String ic, boolean govServ)
    {
        visitorName = name;
        icNumber = ic;
        govServant = govServ;
        
       }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public boolean isGovServant() {
        return govServant;
    }

    public void setGovServant(boolean govServant) {
        this.govServant = govServant;
    }
    
    
    
    
    
    
    public abstract double totalCharge();// method to calculate the charges
    
   @Override
    public String toString(){
        return "\nVisitor name: " + getVisitorName() + "\nVisitor IC Number" + getIcNumber()+ "\nGov Status" + isGovServant() + "\nTotal charge" + totalCharge() ;
    }

   
    
}
