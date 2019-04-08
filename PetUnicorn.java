
/**
 * My PetUnicorn implements the Pet interface
 *
 * @author Ella Kazazic
 * @version 2019-04
 */
public class PetUnicorn extends Unicorn implements Pet
{
    private String name;
    
    public PetUnicorn (String s)
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
    
    public void play ()
    {
        System.out.println ("La-dee-da, I like to compete in FRC!");
    }
}
