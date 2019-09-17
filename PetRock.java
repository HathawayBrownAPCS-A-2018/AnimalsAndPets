
/**
 * Write a description of class PetRock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetRock extends Rock implements Pet
{
    private String name;
    
    public PetRock (String s)
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
        System.out.print ("Waiting out the centuries ... ");
    }
}
