package assessmenttwo;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainClass
{
    public static void main(String[] args)
    {
        //The number of vehicles in the program
        //Each one is a 'public static void'
        One();
        Two();
        Three();
        Four();
        Five();
        Six();
        Seven();
        Eight();
        Nine();
        Ten();
;    }                                    
//Vehicle One---------------------------------------------------------------------------------------
    
    public static void One()
    {
        ArrayList cars = new ArrayList();
        //A neverending list, can add as many vehicles i want
        //Current capacity is 10 vehicles
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        //Strings used with the results
        
        VehicleClass vehicle1 = new VehicleClass
        (2015, "Chevrolet", "Corvette", "23");
        //(int year, String name, String model) 
        
        //Each one is coded for one journey and its Km
        //You see there is only three, look below, there's only three.
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        
        //Tells the program that this is the first vehicle of the 10
        //And anything from the vehicle class must use 'vehicle1'
        //but the next vehicle will use 'vehicle2', not 'vehicle1'
        cars.add(vehicle1);
        
        journey1.SetKm(40);
        vehicle1.addJourney(journey1);  //This is one journey with its Km
        
        journey2.SetKm(30);
        vehicle1.addJourney(journey2);  //This is the second journey with its Km
        
        journey3.SetKm(10);
        vehicle1.addJourney(journey3);  //This is the third journey with its Km
        
        //Year of Vehicle
        System.out.println(categories[0] + vehicle1.GetMakeYear());
        
        //Manufacturer
        System.out.println(categories[1] + vehicle1.GetManuName()); 
        
        //Model of Vehicle
        System.out.println(categories[2] + vehicle1.GetcarModel());
        
        //Fuel Ecomony
        System.out.println(categories[6] + vehicle1.GetfuelEco() + categories[7]);
        
        //Number of Journeys
        System.out.println(categories[3] + vehicle1.grabJourney()); 
        
        //Kilometers Travelled for each Journey
        System.out.println(vehicle1.returnJourney(0).GetKm() + categories[4]); 
        System.out.println(vehicle1.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle1.returnJourney(2).GetKm() + categories[4]);
        
        //Total Km Travelled
        System.out.println(categories[5] + vehicle1.GetTotalKm());
        
        //Fuel Purchase
        System.out.println(categories[8] + vehicle1.GetFuelPurchase());
        
        /*  
        *   A Boolean to test if a vehicle needs service or 
        *   not by using the Kilometers it has done
        */
        if(vehicle1.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }
    
//Vehicle Two---------------------------------------------------------------------------------------
    
    public static void Two()
    {   
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km"; 
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
         
        VehicleClass vehicle2 = new VehicleClass
        (2015, "Ford", "GT", "14.7");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        JourneyClass journey4 = new JourneyClass(0);
        JourneyClass journey5 = new JourneyClass(0);
        cars.add(vehicle2);
        
        journey1.SetKm(50);
        vehicle2.addJourney(journey1); //Number of journeys
        
        journey2.SetKm(8);
        vehicle2.addJourney(journey2);
        
        journey3.SetKm(89);
        vehicle2.addJourney(journey3);
        
        journey4.SetKm(34);
        vehicle2.addJourney(journey4);
        
        journey5.SetKm(112);
        vehicle2.addJourney(journey5);
        
        System.out.println(categories[0] + vehicle2.GetMakeYear());
        System.out.println(categories[1] + vehicle2.GetManuName());
        System.out.println(categories[2] + vehicle2.GetcarModel());
        System.out.println(categories[6] + vehicle2.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle2.grabJourney());
        System.out.println(vehicle2.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle2.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle2.returnJourney(2).GetKm() + categories[4]);
        System.out.println(vehicle2.returnJourney(3).GetKm() + categories[4]);
        System.out.println(vehicle2.returnJourney(4).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle2.GetTotalKm());
        System.out.println(categories[8] + vehicle2.GetFuelPurchase());
        
        if(vehicle2.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }

//Vehicle Three-------------------------------------------------------------------------------------
    
    public static void Three()
    {  
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle3 = new VehicleClass
        (2006, "Dodge", "Charger", "11.6");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        JourneyClass journey4 = new JourneyClass(0);
        JourneyClass journey5 = new JourneyClass(0);
        JourneyClass journey6 = new JourneyClass(0);
        JourneyClass journey7 = new JourneyClass(0);
        JourneyClass journey8 = new JourneyClass(0);
        cars.add(vehicle3);
        
        journey1.SetKm(24);
        vehicle3.addJourney(journey1);
        
        journey2.SetKm(10);
        vehicle3.addJourney(journey2);
        
        journey3.SetKm(14);
        vehicle3.addJourney(journey3);
        
        journey4.SetKm(5);
        vehicle3.addJourney(journey4);
        
        journey5.SetKm(7);
        vehicle3.addJourney(journey5);
        
        journey6.SetKm(3);
        vehicle3.addJourney(journey6);
        
        journey7.SetKm(11);
        vehicle3.addJourney(journey7);
        
        journey8.SetKm(23);
        vehicle3.addJourney(journey8);
        
        System.out.println(categories[0] + vehicle3.GetMakeYear());
        System.out.println(categories[1] + vehicle3.GetcarModel());
        System.out.println(categories[2] + vehicle3.GetManuName());
        System.out.println(categories[6] + vehicle3.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle3.grabJourney());
        System.out.println(vehicle3.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(2).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(3).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(4).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(5).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(6).GetKm() + categories[4]);
        System.out.println(vehicle3.returnJourney(7).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle3.GetTotalKm());
        System.out.println(categories[8] + vehicle3.GetFuelPurchase());
        
        if(vehicle3.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }
    
//Vehicle Four--------------------------------------------------------------------------------------
        
    public static void Four()
    {     
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle4 = new VehicleClass
        (2011, "Subaru", "WRX", "10.4");
        JourneyClass journey1 = new JourneyClass(0);
        cars.add(vehicle4);
        
        journey1.SetKm(76);
        vehicle4.addJourney(journey1);
        
        System.out.println(categories[0] + vehicle4.GetMakeYear());
        System.out.println(categories[1] + vehicle4.GetManuName());
        System.out.println(categories[2] + vehicle4.GetcarModel());
        System.out.println(categories[6] + vehicle4.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle4.grabJourney());
        System.out.println(vehicle4.returnJourney(0).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle4.GetTotalKm());
        System.out.println(categories[8] + vehicle4.GetFuelPurchase());
        
        if(vehicle4.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }

//Vehicle Five--------------------------------------------------------------------------------------
    
    public static void Five()
    {       
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle5 = new VehicleClass
        (1999, "Nissan", "Skyline", "10.2");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        cars.add(vehicle5);
        
        journey1.SetKm(34);
        vehicle5.addJourney(journey1);
        
        journey2.SetKm(76);
        vehicle5.addJourney(journey2);
        
        System.out.println(categories[0] + vehicle5.GetMakeYear());
        System.out.println(categories[1] + vehicle5.GetManuName());
        System.out.println(categories[2] + vehicle5.GetcarModel());
        System.out.println(categories[6] + vehicle5.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle5.grabJourney());
        System.out.println(vehicle5.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle5.returnJourney(1).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle5.GetTotalKm());
        System.out.println(categories[8] + vehicle5.GetFuelPurchase());
        
        if(vehicle5.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }

//Vehicle Six---------------------------------------------------------------------------------------
    
    public static void Six()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle6 = new VehicleClass
        (2015, "Pagani", "Huayra", "12.8");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        cars.add(vehicle6);
        
        journey1.SetKm(44);
        vehicle6.addJourney(journey1);
        
        journey2.SetKm(22);
        vehicle6.addJourney(journey2);
        
        journey3.SetKm(6);
        vehicle6.addJourney(journey3);
        
        System.out.println(categories[0] + vehicle6.GetMakeYear());
        System.out.println(categories[1] + vehicle6.GetManuName());
        System.out.println(categories[2] + vehicle6.GetcarModel());
        System.out.println(categories[6] + vehicle6.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle6.grabJourney());
        System.out.println(vehicle6.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle6.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle6.returnJourney(2).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle6.GetTotalKm());
        System.out.println(categories[8] + vehicle6.GetFuelPurchase());
        
        if(vehicle6.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }

//Vehicle Seven-------------------------------------------------------------------------------------
    
    public static void Seven()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle7 = new VehicleClass
        (2014, "Lamborghini", "Aventador", "11.1");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        JourneyClass journey4 = new JourneyClass(0);
        cars.add(vehicle7);
        
        journey1.SetKm(20);
        vehicle7.addJourney(journey1);
        
        journey2.SetKm(34);
        vehicle7.addJourney(journey2);
        
        journey3.SetKm(12);
        vehicle7.addJourney(journey3);
        
        journey4.SetKm(23);
        vehicle7.addJourney(journey4);
        
        System.out.println(categories[0] + vehicle7.GetMakeYear());
        System.out.println(categories[1] + vehicle7.GetManuName());
        System.out.println(categories[2] + vehicle7.GetcarModel());
        System.out.println(categories[6] + vehicle7.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle7.grabJourney());
        System.out.println(vehicle7.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle7.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle7.returnJourney(2).GetKm() + categories[4]);
        System.out.println(vehicle7.returnJourney(3).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle7.GetTotalKm());
        System.out.println(categories[8] + vehicle7.GetFuelPurchase());

        
        if(vehicle7.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }
        
//Vehicle Eight-------------------------------------------------------------------------------------
    
    public static void Eight()
    {   
        System.out.println("");
        
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle8 = new VehicleClass
        (2013, "Ferrari", "458", "12.3");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        JourneyClass journey4 = new JourneyClass(0);
        JourneyClass journey5 = new JourneyClass(0);
        JourneyClass journey6 = new JourneyClass(0);
        cars.add(vehicle8);
        
        
        journey1.SetKm(84);
        vehicle8.addJourney(journey1);
        
        journey2.SetKm(29);
        vehicle8.addJourney(journey2);
        
        journey3.SetKm(11);
        vehicle8.addJourney(journey3);
        
        journey4.SetKm(5);
        vehicle8.addJourney(journey4);
        
        journey5.SetKm(8);
        vehicle8.addJourney(journey5);
        
        journey6.SetKm(77);
        vehicle8.addJourney(journey6);
        
        System.out.println(categories[0] + vehicle8.GetMakeYear());
        System.out.println(categories[1] + vehicle8.GetManuName());
        System.out.println(categories[2] + vehicle8.GetcarModel());
        System.out.println(categories[6] + vehicle8.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle8.grabJourney());
        System.out.println(vehicle8.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle8.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle8.returnJourney(2).GetKm() + categories[4]);
        System.out.println(vehicle8.returnJourney(3).GetKm() + categories[4]);
        System.out.println(vehicle8.returnJourney(4).GetKm() + categories[4]);
        System.out.println(vehicle8.returnJourney(5).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle8.GetTotalKm());
        System.out.println(categories[8] + vehicle8.GetFuelPurchase());
        
        
        if(vehicle8.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }

//Vehicle Nine--------------------------------------------------------------------------------------
    
        public static void Nine()
    {   
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle9 = new VehicleClass
        (1967, "Shelby", "GT500", "13.2");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        cars.add(vehicle9);
        
        journey1.SetKm(55);
        vehicle9.addJourney(journey1);
        
        journey2.SetKm(20);
        vehicle9.addJourney(journey2);
        
        System.out.println(categories[0] + vehicle9.GetMakeYear());
        System.out.println(categories[1] + vehicle9.GetManuName());
        System.out.println(categories[2] + vehicle9.GetcarModel());
        System.out.println(categories[6] + vehicle9.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle9.grabJourney());
        System.out.println(vehicle9.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle9.returnJourney(1).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle9.GetTotalKm());
        System.out.println(categories[8] + vehicle9.GetFuelPurchase());
        
        if(vehicle9.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }
    
//Vehicle Ten---------------------------------------------------------------------------------------
    public static void Ten()
    {   
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[9];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of Journeys: ";
        categories[4] = " Km";
        categories[5] = "Total Kilometers: ";
        categories[6] = "Fuel Ecomony: ";
        categories[7] = " Litres Per 100km";
        categories[8] = "Fuel Purchase: $";
        
        VehicleClass vehicle10 = new VehicleClass
        (2015, "Dodge", "Viper", "12.8");
        JourneyClass journey1 = new JourneyClass(0);
        JourneyClass journey2 = new JourneyClass(0);
        JourneyClass journey3 = new JourneyClass(0);
        JourneyClass journey4 = new JourneyClass(0);
        JourneyClass journey5 = new JourneyClass(0);
        JourneyClass journey6 = new JourneyClass(0);
        JourneyClass journey7 = new JourneyClass(0);
        JourneyClass journey8 = new JourneyClass(0);
        JourneyClass journey9 = new JourneyClass(0);
        cars.add(vehicle10);
        
        journey1.SetKm(19);
        vehicle10.addJourney(journey1);
        
        journey2.SetKm(4);
        vehicle10.addJourney(journey2);
        
        journey3.SetKm(2);
        vehicle10.addJourney(journey3);
        
        journey4.SetKm(3);
        vehicle10.addJourney(journey4);
        
        journey5.SetKm(5);
        vehicle10.addJourney(journey5);
        
        journey6.SetKm(4);
        vehicle10.addJourney(journey6);
        
        journey7.SetKm(9);
        vehicle10.addJourney(journey7);
        
        journey8.SetKm(5);
        vehicle10.addJourney(journey8);
        
        journey9.SetKm(23);
        vehicle10.addJourney(journey9);
        
        System.out.println(categories[0] + vehicle10.GetMakeYear());
        System.out.println(categories[1] + vehicle10.GetManuName());
        System.out.println(categories[2] + vehicle10.GetcarModel());
        System.out.println(categories[6] + vehicle10.GetfuelEco() + categories[7]);
        System.out.println(categories[3] + vehicle10.grabJourney());
        System.out.println(vehicle10.returnJourney(0).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(1).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(2).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(3).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(4).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(5).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(6).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(7).GetKm() + categories[4]);
        System.out.println(vehicle10.returnJourney(8).GetKm() + categories[4]);
        System.out.println(categories[5] + vehicle10.GetTotalKm());
        System.out.println(categories[8] + vehicle10.GetFuelPurchase());
        
        
        if(vehicle10.SetService() == true)
        {
            System.out.println("Needs Service");
        }
        
        else
        {
            System.out.println("Doesn't need Service");
        }
    }    
//END-----------------------------------------------------------------------------------------------
}
        /*
            JOptionPane.showMessageDialog(null, categories[0] + vehicle1.GetMakeYear() 
            + "\n" + categories[1] + vehicle1.GetManuName());
        */