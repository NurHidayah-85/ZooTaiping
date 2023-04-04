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

//the TestZoo application
import java.util.*;//this will include all classes from java.util package


public class TestZoo {
     // Main driver method
public static void main (String[] args) 
    { 
        String visitorName;
        String icNumber;
        boolean govServant;
        String category;
        boolean packageA; //if the visitor choose package A
        boolean packageB; //if the visitor choose package B
        boolean packageC; //if the visitor choose package C
        String visitType;
        char select;
        
        Scanner s = new Scanner (System.in);// Create a Scanner object as input
        
       //use this coding toe insert number of patients in manual
        //System.out.print("Please enter Number of patients : ");
        //numpatient = Integer.parseInt(s.nextLine());
        //answer b(i)
        //Patient [] p = new Patient[numpatient];  // declare an array p with the size of 50
        
        
        //answer b(i)
        ZooTaiping [] zoo = new ZooTaiping[2];  // declare an array p with the size of 50
        
        

        
        for (int i =0; i<zoo.length; i++) 
        { // p[i] = new Patient(); 
            System.out.println ("Visitor "+ (i+1)); 
            System.out.println ("Enter D(Day visit) or N(Night visit - ONLY FOR ADULT) to visit"); //type of visit
            visitType = s.nextLine(); 
            select = visitType.charAt(0);
            
            if (visitType.equalsIgnoreCase("D")) 
            { 
            
            System.out.println ("Enter name: "); //visitor name
            visitorName = s.nextLine(); 
            System.out.println ("Enter ICNumber: (ex:850204-02-5930) "); //visitor ICnumber
            icNumber = s.nextLine(); 
            System.out.println ("Are you Goverment servant? (TRUE / FALSE): "); //visitor category
            govServant = Boolean.parseBoolean(s.nextLine());
            System.out.println ("Please choose one selection for category - Kid/Adult) "); //visitor category
            category = s.nextLine(); 
                 
            
            zoo[i] = new DayVisit (visitorName, icNumber,govServant,category);
           
              
        }
            
            
            
            else if (visitType.equalsIgnoreCase("N")) 
            { 
            System.out.println ("ONLY FOR ADULT!!"); 
            System.out.println ("Enter name: "); //visitor name
            visitorName = s.nextLine(); 
            System.out.println ("Enter ICNumber: (ex:850204-02-5930) "); //visitor ICnumber
            icNumber = s.nextLine(); 
            System.out.println ("Are you Goverment servant? (TRUE / FALSE): "); //patient address
            govServant = Boolean.parseBoolean(s.nextLine()); 
            System.out.println ("Are you chooce PACKAGE A-RM50.00? (TRUE / FALSE): "); //package
            packageA = Boolean.parseBoolean(s.nextLine());  
            System.out.println ("Are you chooce PACKAGE B-RM75.00? (TRUE / FALSE): "); //package
            packageB = Boolean.parseBoolean(s.nextLine());  
            System.out.println ("Are you chooce PACKAGE C-RM100.00?(TRUE / FALSE): "); //package
            packageC = Boolean.parseBoolean(s.nextLine()); 
            
            
            
            zoo[i] = new NightVisit (visitorName, icNumber,govServant,packageA,packageB,packageC);
           
              
        }
        }
        
        //answer 2
        int j=0,countN=0, countD=0;
        double sum=0.00;
        
              for ( j = 0; j<zoo.length; j++)
              {
                 if (zoo[j]instanceof NightVisit) 
                 {
                     sum+= zoo[j].totalCharge();
                     countN++;
                     
              }
                 else if (zoo[j]instanceof DayVisit)
                 {
                     sum+= zoo[j].totalCharge();
                     countD++;
                 }
              }
              
            System.out.println ("Day:" +countD + "people"+"\nNight" + countN + "people"+ "\nTotal amount (RM): " + sum);  
            
            
       //answer 3
        
              for ( j = 0; j<zoo.length; j++)
              {
                  if (zoo[j].isPackageC()==true && zoo[j] instanceof NightVisit)
                  {
                      System.out.println(zoo[j]);
                  }
              }
      
      
      
      
       //display all information 
        for ( j = 0; j<zoo.length; j++) {
        System.out.println(zoo[j]);

        }
        
        
    }
    }
}
