
/**
 * Write a description of class PetTiger here.
 *
 * @author Kim
 * @version 2019-04
 */
public class PetTiger extends Tiger implements Pet
{
    private String name;
    
    public PetTiger (String s)
    {
        super(); 
        name = s; 
    }
    
    public String getName()
    {
        return name;
    }
    public void setName (String s)
    {
        name = s;
    }
    public void play()
    {
        System.out.print ("Rawr I like to run!");
    }
}
