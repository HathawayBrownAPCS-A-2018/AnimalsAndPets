
/**
 * Write a description of class PetLeopard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetLeopard
{
    private String name;
    
    public PetLeopard(String s)
    {
        super();
        name = s;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void  setName (String  s)
    {
        name = s;
    }
    
    public void play()
    {
        System.out.print("La-dee-da, I like to strole through the grassland!");
    }
}
