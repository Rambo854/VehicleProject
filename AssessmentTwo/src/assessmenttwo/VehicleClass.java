package assessmenttwo;

public class VehicleClass 
{
    private JourneyClass[] arrayJourney = new JourneyClass[10];
    
    private Service[] serviceArray = new Service[1];
    
    String[] detailsArrays = new String[3]; //Define size of array   
    int[] yearArrays = new int[1];
    
    private int makeYear = 0;
    private String manuName = "No manufacturer given";
    private String carModel = "model unknown";
    private int journeyIndex;
    //private String fuelEconomy;
    //Defaults
 
    public VehicleClass() //Create a constructor
    {
        detailsArrays[0] = manuName;
        detailsArrays[1] = carModel;
    }
        //Default constructor 
    
    void addJourney(JourneyClass jourVariable)
    {
        this.arrayJourney[journeyIndex] = jourVariable;
                journeyIndex++;
    }
    int grabJourney()
    {
        return journeyIndex;
    }
    
    public JourneyClass returnJourney(int JourneyIndex)
    {
        return arrayJourney[JourneyIndex];
    }
    
    boolean SetService()
    {
        int counter;
        int TotalKm = 0;
        
        for(counter = 0; counter < journeyIndex; counter++)
        {
            
            TotalKm = TotalKm + arrayJourney[counter].GetKm();  
        }
        
        if(TotalKm < 100)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    String GetTotalKm()
    {
        String total;
        int counter;
        int TotalKm = 0;
        
        for(counter = 0; counter < journeyIndex; counter++)
        {
            
            TotalKm = TotalKm + arrayJourney[counter].GetKm();  
        }
        
        total = Integer.toString(TotalKm);
        
        return total;
    }
    
    public VehicleClass(int makeYear, String manuName, String carModel, String fuelEco)
    {
        this.yearArrays[0] = makeYear;
        this.detailsArrays[0] = manuName;
        this.detailsArrays[1] = carModel;
        this.detailsArrays[2] = fuelEco;
    }
        
    void SetManuName(String name)
    {
        detailsArrays[0] = name;
    }    
    String GetManuName()
    {
        return detailsArrays[0];
    }
        
    void SetcarModel(String model)
    {
        detailsArrays[1] = model;
    }   
    String GetcarModel()
    {
        return detailsArrays[1];
    }
        
    void SetMakeYear(int makeYear)
    {
        yearArrays[0] = makeYear;
    }    
    int GetMakeYear()
    {
        return yearArrays[0];
    }
    
    void SetfuelEco(String fuelECO)
    {
        detailsArrays[2] = fuelECO;
    }    
    String GetfuelEco()
    {
        return detailsArrays[2];
    }
    
    String GetFuelPurchase()
    {
        String FuelPurchase;
        int counter;
        double FuelPurchaseNUM;
        double PricePerLitre = 1.20;
        double TotalKm = 0.00;
        double litresPer100;
        double LitresPerTotalKM = 0;
        
        
        for(counter = 0; counter < journeyIndex; counter++)
        {
            
            TotalKm = TotalKm + arrayJourney[counter].GetKm();  
        }
        
        TotalKm = TotalKm/100;
        
        litresPer100 = Double.parseDouble(detailsArrays[2]);
        
        LitresPerTotalKM = TotalKm*litresPer100;
        
        FuelPurchaseNUM = LitresPerTotalKM*PricePerLitre;
        
        FuelPurchase = Double.toString(FuelPurchaseNUM);
        
        return FuelPurchase;
    }
}
    
