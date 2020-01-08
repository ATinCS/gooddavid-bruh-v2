
/**
 * Write a description of class willReindeerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class willReindeerTester
{
    public static void Main(String[] args)
    {
        Reindeer joe = new Reindeer("Joe" , false, 2);
        Reindeer bruh = new Reindeer("David", false, 4);
        Reindeer perry = new Reindeer("Mrs Perry :)", true, 3);
        
        bruh.changeName("Bruh David");
        
        System.out.println(joe.toString());
        
        System.out.println(perry.determineTeamHappiness());   
        
        System.out.println("Bruh David got a light! Determining new happiness...");
        
        bruh.setNoseAbility(true);
        
        System.out.println(perry.determineTeamHappiness());
        
        joe.changeEnergy(2);
        
        System.out.println("Joe got an energy boost! His new energy is " + joe.getEnergyLevel());
        
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
    }
    
}
