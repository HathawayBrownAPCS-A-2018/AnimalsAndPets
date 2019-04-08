
/**
 * Write a description of class PetRhino here.
 *
 * @author (Emily Duijser)
 * @version (2019-04)
 */
public class PetRhino extends Rhino implements Pet
{
    private String name;
    
    public PetRhino(String s)
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
        System.out.print("La-dee-da I like to play in the water and eat!");
    }
    
}