
/**
 * My PetZebra implements the Pet interfact
 *
 * @author (Meredith Clemens)
 * @version (2019-04)
 */
public class PetZebra extends Zebra implements Pet
{
    private String name;
    
    public PetZebra(String s)
    {
        super();
        name = s;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String s)
    {
        name = s;
    }
    
    public void play()
    {
        System.out.print ("La-dee-da, I like to stroll through the grasslands!");
    }
}
