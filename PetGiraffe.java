
/**
 * My PetGiraffe implements the Pet interface
 *
 * @author MB
 * @version 2019-04
 */
public class PetGiraffe extends Giraffe implements Pet
{
    private String name;
    
    public PetGiraffe (String s)
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
        System.out.print ("La-dee-da, I like to stroll through the grasslands!");
    }
}
