
package assessmenttwo;

public class Service
{
    private boolean hiddenService = false; //Default
    
    public Service (boolean hiddenService)
    {
        hiddenService = hiddenService;
    }
    
    void SetCheck(boolean YesNo)
    {
        hiddenService = YesNo;
    }
    
    boolean GetCheck()
    {
        return hiddenService; 
    }
}
