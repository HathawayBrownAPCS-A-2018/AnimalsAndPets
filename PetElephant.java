
/**
 * A pet Elephant
 *
 * @author Katrina
 * @version April 2019
 */
public class PetElephant extends Elephant implements Pet
{
    //Private Variables
    private String name;
    
    //Constructor
    public PetElephant (String s)
    {
        super();
        name = s;
    }
    
    
    //Methods
    public String getName()
    {
        return name;
    }
    
    public void setName (String s)
    {
        name = s;
    }
    
    public void play()
    {
        System.out.print ("I like to stomp through the mud");
    }
}
