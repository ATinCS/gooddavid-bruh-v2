
/**
 * Write a description of class mikhailReinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mikhailReinRunner
{
    public mikhailReinRunner()
    {
        Reindeer rudoplh = new Reindeer("Rudoplh" , true, 2);
        Reindeer dash = new Reindeer("Dash", false, 4);
        
        System.out.println(dash.determineTeamHappiness());
        System.out.println(dash.getName());
        System.out.println(dash.doesNoseGlow());
        System.out.println(dash.getEnergyLevel());
        dash.setNoseAbility(true);
        dash.changeEnergy(2);
        dash.changeName("spongebob");
        System.out.println(dash.getName());
        System.out.println(dash.doesNoseGlow());
        System.out.println(dash.getEnergyLevel());
        System.out.println(dash.determineTeamHappiness());
        System.out.println(dash.toString());
    }
}
