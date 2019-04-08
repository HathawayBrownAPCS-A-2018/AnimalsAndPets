
/**
 * A pet leopard.
 *
 * @author Patty Gannon
 * @version April 2019
 */
public class PetLeopard extends Leopard implements Pet
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
        System.out.print("La-dee-da, I race through the grassland!");
    }
}
