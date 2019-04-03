
/**
 * Write a description of class Zebra here.
 *
 * @author Meredith Clemens
 * @version (a version number or a date)
 */
public class Zebra extends Animal
{
    public Zebra ()
    {
        super();
        setSpecies("zebra");
    }
    
    public void eat ()
    {
        System.out.print ("Yum! grasses, leaves, and bark! \t");
    }
    
    public void speak ()
    {
        System.out.print ("snort snort bark bark");   
    }
}
