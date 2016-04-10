package assessmenttwo;

public class JourneyClass
{
    private int hiddenJourney = 0;
    //Defaults
    
    int[] travelledJourney = new int[1];
    
    public JourneyClass(int hiddenJourney)
    {
          this.travelledJourney[0] = hiddenJourney; 
    }
    
    void SetKm(int distance)
    {
        travelledJourney[0] = distance;
    }
    int GetKm()
    {
       return travelledJourney[0]; 
    }
}
