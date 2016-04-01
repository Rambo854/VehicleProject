package assessmenttwo;

public class VehicleClass 
{
    private String manuName = "No manufacturer given";
    private String carModel = "model unknown";
    private int makeYear = 0;
    //Defaults
        
    String[] detailsArrays = new String[2]; //Define size of array
        
    int[] yearArrays = new int[1];
        
    public VehicleClass() //Create a constructor
    {
        detailsArrays[0] = manuName;
        detailsArrays[1] = carModel;
    }
        //Default constructor  
        
    public VehicleClass(int makeYear, String manuName, String carModel)
    {
        this.yearArrays[0] = makeYear;
        this.detailsArrays[0] = manuName;
        this.detailsArrays[1] = carModel;
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
}
    
