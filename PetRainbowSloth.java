
/**
 * Write a description of class PetRainbowSloth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetRainbowSloth extends RainbowSloth implements Pet
{
    private String name;
    public PetRainbowSloth(String s)
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
        System.out.print("I sleep. But in a more awesome way.");
    }
}
