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
public class NightVisit extends ZooTaiping {
    public boolean packageA; //if the visitor choose package A
    public boolean packageB; //if the visitor choose package B
    public boolean packageC; //if the visitor choose package C
   
    
    public NightVisit(String name, String ic, boolean govServ,boolean pA,boolean pB, boolean pC)
    {
        super (name,ic,govServ);
    
        packageA = pA;
        packageB = pB;
        packageC = pC;
        
    }

    public boolean isPackageA() {
        return packageA;
    }

    public void setPackageA(boolean packageA) {
        this.packageA = packageA;
    }

    public boolean isPackageB() {
        return packageB;
    }

    public void setPackageB(boolean packageB) {
        this.packageB = packageB;
    }

    public boolean isPackageC() {
        return packageC;
    }

    public void setPackageC(boolean packageC) {
        this.packageC = packageC;
    }

    
    
    @Override
    public double totalCharge (){
       
        double total = 0.00;
        double feepA = 50.00;
        double feepB = 75.00;
        double feepC = 100.00;
        
      
        
            if (isPackageA() == true &&isPackageB() == false && isPackageC() == false )
                 {
                total= feepA;
                
                }
            else if(isPackageA() == false && isPackageB() == true && isPackageC() == false )
                 {
                total= feepB;
                }
            
            else if (isPackageA() == false && isPackageB() ==false  && isPackageC() == true)
                 {
               total= feepC;
                }
                            
                
            if (super.isGovServant()== true)
           
            return (0.85 * total);
            else 
                return total;}

      @Override
        public String toString(){
            return super.toString();
        }
       }
