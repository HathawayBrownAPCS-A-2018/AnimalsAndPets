
/**
 * Write a description of class PetFox here.
 *
 * @author Ryan Brady
 * @version (a version number or a date)
 */
public class PetFox extends Fox implements Pet
{
    private String name;
    
    public PetFox (String s)
    {
        super();
        name = s;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setName (String s)
    {
        name = s;
    }
    
    public void play ()
    {
        System.out.print ("Running in circles is so fun!");
    }
}