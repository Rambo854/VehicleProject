package assessmenttwo;

public class JourneyClass
{
    private int hiddenJourney = 0;
    //Defaults
    
    public JourneyClass(int hiddenJourney)
    {
       hiddenJourney = hiddenJourney;
    }
    
    void SetKm(int distance)
    {
        hiddenJourney = distance;
    }
    
    int GetKm()
    {
       return hiddenJourney; 
    }
}
