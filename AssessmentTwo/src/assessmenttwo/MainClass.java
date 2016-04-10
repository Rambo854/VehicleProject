package assessmenttwo;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainClass
{
    public static void main(String[] args)
    {
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
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle1 = new VehicleClass(2015, "Chevrolet", "Corvette"); //(int year, String name, String model) 
        JourneyClass journey1 = new JourneyClass(0);
        cars.add(vehicle1);
        
        vehicle1.addJourney(journey1);  //Number of journeys
        vehicle1.addJourney(journey1);
        vehicle1.addJourney(journey1);
        
        System.out.println(categories[0] + vehicle1.GetMakeYear()); //Year
        System.out.println(categories[1] + vehicle1.GetManuName()); //Manu
        System.out.println(categories[2] + vehicle1.GetcarModel()); //Model
        System.out.println(categories[3] + vehicle1.grabJourney()); //No. Of Journeys
        //System.out.println(vehicle1.grabJourney() + categories[3]); //Kilometers
    }
    
//Vehicle Two---------------------------------------------------------------------------------------
    
    public static void Two()
    {    
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
         
        VehicleClass vehicle2 = new VehicleClass(2015, "Ford", "GT");
        JourneyClass journey2 = new JourneyClass(0);
        cars.add(vehicle2);
        
        vehicle2.addJourney(journey2); //Number of journeys
        vehicle2.addJourney(journey2);
        vehicle2.addJourney(journey2);
        vehicle2.addJourney(journey2);
        vehicle2.addJourney(journey2);
        
        System.out.println(categories[0] + vehicle2.GetMakeYear());
        System.out.println(categories[1] + vehicle2.GetManuName());
        System.out.println(categories[2] + vehicle2.GetcarModel());
        System.out.println(categories[3] + vehicle2.grabJourney());
    }

//Vehicle Three-------------------------------------------------------------------------------------
    
    public static void Three()
    {  
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle3 = new VehicleClass(1969, "Dodge", "Charger");
        JourneyClass journey3 = new JourneyClass(0);
        cars.add(vehicle3);
        
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        vehicle3.addJourney(journey3);
        
        System.out.println(categories[0] + vehicle3.GetMakeYear());
        System.out.println(categories[1] + vehicle3.GetcarModel());
        System.out.println(categories[2] + vehicle3.GetManuName());
        System.out.println(categories[3] + vehicle3.grabJourney());
    }
    
//Vehicle Four--------------------------------------------------------------------------------------
        
    public static void Four()
    {     
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle4 = new VehicleClass(2011, "Subaru", "WRX");
        JourneyClass journey4 = new JourneyClass(0);
        cars.add(vehicle4);
        
        vehicle4.addJourney(journey4);
        
        System.out.println(categories[0] + vehicle4.GetMakeYear());
        System.out.println(categories[1] + vehicle4.GetManuName());
        System.out.println(categories[2] + vehicle4.GetcarModel());
        System.out.println(categories[3] + vehicle4.grabJourney());
    }

//Vehicle Five--------------------------------------------------------------------------------------
    
    public static void Five()
    {       
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle5 = new VehicleClass(1999, "Nissan", "Skyline");
        JourneyClass journey5 = new JourneyClass(0);
        cars.add(vehicle5);
        
        vehicle5.addJourney(journey5);
        vehicle5.addJourney(journey5);
        
        System.out.println(categories[0] + vehicle5.GetMakeYear());
        System.out.println(categories[1] + vehicle5.GetManuName());
        System.out.println(categories[2] + vehicle5.GetcarModel());
        System.out.println(categories[3] + vehicle5.grabJourney());
    }

//Vehicle Six---------------------------------------------------------------------------------------
    
    public static void Six()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle6 = new VehicleClass(2015, "Pagani", "Huayra");
        JourneyClass journey6 = new JourneyClass(0);
        cars.add(vehicle6);
        
        vehicle6.addJourney(journey6);
        vehicle6.addJourney(journey6);
        vehicle6.addJourney(journey6);
        
        System.out.println(categories[0] + vehicle6.GetMakeYear());
        System.out.println(categories[1] + vehicle6.GetManuName());
        System.out.println(categories[2] + vehicle6.GetcarModel());
        System.out.println(categories[3] + vehicle6.grabJourney());
    }

//Vehicle Seven-------------------------------------------------------------------------------------
    
    public static void Seven()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle7 = new VehicleClass(2014, "Lamborghini", "Aventador");
        JourneyClass journey7 = new JourneyClass(0);
        cars.add(vehicle7);
        
        vehicle7.addJourney(journey7);
        vehicle7.addJourney(journey7);
        vehicle7.addJourney(journey7);
        vehicle7.addJourney(journey7);
        
        System.out.println(categories[0] + vehicle7.GetMakeYear());
        System.out.println(categories[1] + vehicle7.GetManuName());
        System.out.println(categories[2] + vehicle7.GetcarModel());
        System.out.println(categories[3] + vehicle7.grabJourney());
    }
        
//Vehicle Eight-------------------------------------------------------------------------------------
    
    public static void Eight()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle8 = new VehicleClass(2013, "Ferrari", "458");
        JourneyClass journey8 = new JourneyClass(0);
        cars.add(vehicle8);
        
        vehicle8.addJourney(journey8);
        vehicle8.addJourney(journey8);
        vehicle8.addJourney(journey8);
        vehicle8.addJourney(journey8);
        vehicle8.addJourney(journey8);
        vehicle8.addJourney(journey8);
        
        System.out.println(categories[0] + vehicle8.GetMakeYear());
        System.out.println(categories[1] + vehicle8.GetManuName());
        System.out.println(categories[2] + vehicle8.GetcarModel());
        System.out.println(categories[3] + vehicle8.grabJourney());
    }

//Vehicle Nine--------------------------------------------------------------------------------------
    
        public static void Nine()
    {   
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle9 = new VehicleClass(1967, "Shelby", "GT500");
        JourneyClass journey9 = new JourneyClass(0);
        cars.add(vehicle9);
        
        vehicle9.addJourney(journey9);
        vehicle9.addJourney(journey9);
        
        System.out.println(categories[0] + vehicle9.GetMakeYear());
        System.out.println(categories[1] + vehicle9.GetManuName());
        System.out.println(categories[2] + vehicle9.GetcarModel());
        System.out.println(categories[3] + vehicle9.grabJourney());
    }
    
//Vehicle Ten---------------------------------------------------------------------------------------
    public static void Ten()
    {
        System.out.println("");
        
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[5];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = "No. of journeys: ";
        categories[4] = " Km";
        
        VehicleClass vehicle10 = new VehicleClass(2015, "Dodge", "Viper");
        JourneyClass journey10 = new JourneyClass(0);
        cars.add(vehicle10);
        
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        vehicle10.addJourney(journey10);
        
        System.out.println(categories[0] + vehicle10.GetMakeYear());
        System.out.println(categories[1] + vehicle10.GetManuName());
        System.out.println(categories[2] + vehicle10.GetcarModel());
        System.out.println(categories[3] + vehicle10.grabJourney());
    }    
//END-----------------------------------------------------------------------------------------------
}
        /*
            JOptionPane.showMessageDialog(null, categories[0] + vehicle1.GetMakeYear() 
            + "\n" + categories[1] + vehicle1.GetManuName());
        */