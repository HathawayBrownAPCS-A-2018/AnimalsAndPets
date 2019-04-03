
/**
 * Write a description of class Elephant here.
 *
 * @author (Katrina)
 * @version (April 2019)
 */
public class Elephant extends Animal
{
    public Elephant ()
    {
        super();
        setSpecies("elephant");
    }
    
    public void eat()
    {
        System.out.print ("Grass, plants, and tree bark! \t");
    }
    
    public void speak()
    {
        System.out.print ("*trumpet-ish sound*");
    }
}
