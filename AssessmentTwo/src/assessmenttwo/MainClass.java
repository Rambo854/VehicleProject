package assessmenttwo;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList cars = new ArrayList();
        
        String[] categories = new String[4];
        categories[0] = "Make Year: ";
        categories[1] = "Manufacturer: ";
        categories[2] = "Model: ";
        categories[3] = " Kilometers";
                                        //(int year, String name, String model)
        
        VehicleClass vehicle1 = new VehicleClass(2015, "Chevrolet", "Corvette");  
        JourneyClass journey1 = new JourneyClass(0);
        cars.add(vehicle1);
        System.out.println(categories[0] + vehicle1.GetMakeYear()); //Year
        System.out.println(categories[1] + vehicle1.GetManuName()); //Manu
        System.out.println(categories[2] + vehicle1.GetcarModel()); //Model
        System.out.println( journey1.GetJourney() + categories[3]); //Kilometers
        
        /*
            JOptionPane.showMessageDialog(null, categories[0] + vehicle1.GetMakeYear() 
            + "\n" + categories[1] + vehicle1.GetManuName());
        */
        
        System.out.println("");
        
        VehicleClass vehicle2 = new VehicleClass(2015, "Ford", "GT");
        cars.add(vehicle2);
        System.out.println(categories[0] + vehicle2.GetMakeYear());
        System.out.println(categories[1] + vehicle2.GetManuName());
        System.out.println(categories[2] + vehicle2.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle3 = new VehicleClass(1969, "Dodge", "Charger");
        cars.add(vehicle3);
        System.out.println(categories[0] + vehicle3.GetMakeYear());
        System.out.println(categories[1] + vehicle3.GetcarModel());
        System.out.println(categories[2] + vehicle3.GetManuName());
        
        System.out.println("");
        
        VehicleClass vehicle4 = new VehicleClass(2011, "Subaru", "WRX");
        cars.add(vehicle4);
        System.out.println(categories[0] + vehicle4.GetMakeYear());
        System.out.println(categories[1] + vehicle4.GetManuName());
        System.out.println(categories[2] + vehicle4.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle5 = new VehicleClass(1999, "Nissan", "Skyline");
        cars.add(vehicle5);
        System.out.println(categories[0] + vehicle5.GetMakeYear());
        System.out.println(categories[1] + vehicle5.GetManuName());
        System.out.println(categories[2] + vehicle5.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle6 = new VehicleClass(2015, "Pagani", "Huayra");
        cars.add(vehicle6);
        System.out.println(categories[0] + vehicle6.GetMakeYear());
        System.out.println(categories[1] + vehicle6.GetManuName());
        System.out.println(categories[2] + vehicle6.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle7 = new VehicleClass(2014, "Lamborghini", "Aventador");
        cars.add(vehicle7);
        System.out.println(categories[0] + vehicle7.GetMakeYear());
        System.out.println(categories[1] + vehicle7.GetManuName());
        System.out.println(categories[2] + vehicle7.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle8 = new VehicleClass(2013, "Ferrari", "458");
        cars.add(vehicle8);
        System.out.println(categories[0] + vehicle8.GetMakeYear());
        System.out.println(categories[1] + vehicle8.GetManuName());
        System.out.println(categories[2] + vehicle8.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle9 = new VehicleClass(1967, "Shelby", "GT500");
        cars.add(vehicle9);
        System.out.println(categories[0] + vehicle9.GetMakeYear());
        System.out.println(categories[1] + vehicle9.GetManuName());
        System.out.println(categories[2] + vehicle9.GetcarModel());
        
        System.out.println("");
        
        VehicleClass vehicle10 = new VehicleClass(2015, "Dodge", "Viper");
        cars.add(vehicle10);
        System.out.println(categories[0] + vehicle10.GetMakeYear());
        System.out.println(categories[1] + vehicle10.GetManuName());
        System.out.println(categories[2] + vehicle10.GetcarModel());
    }
}
