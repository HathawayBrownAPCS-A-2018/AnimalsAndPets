
/**
 * Write a description of class PetDog here.
 *
 * @author Kat Lynch-APCS
 * @version (a version number or a date)
 */
public class PetDog extends Dog implements Pet 
{
    private String name; 
    public PetDog (String s)
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
        System.out.print ("I love to Play");
    }
}
