
/**
 * Write a description of class Rock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rock extends Animal
{
    public Rock ()
    {
        super();
        setSpecies("rock");
    }
    
    public void eat()
    {
        System.out.print ("... centuries ... \t");
    }
    
    public void speak ()
    {
        System.out.print ("..............");
    }
}