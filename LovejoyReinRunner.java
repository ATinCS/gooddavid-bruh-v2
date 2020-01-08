
/**
 * LovejoyReinRunner creates three Reindeer objects and tests the functionality of all of the Reindeer Class methods 
 *
 * @Lovejoy 
 * @182020 
 */
public class LovejoyReinRunner
{
    
    /**
     * Tests the Reindeer Class
     */
    public static void main (String[]args)
    {
        //creates three Reindeer Objects 
        Reindeer num1 = new Reindeer ("One", true, 20);
        Reindeer num2 = new Reindeer ("Two", false, 1);
        Reindeer num3 = new Reindeer ("Last", true, 100);
        
        // Tests the Different Reindeer Methods
        
        //Tests the getName method for each reindeer object 
        System.out.println(num1.getName());
        System.out.println(num2.getName());
        System.out.println(num3.getName());
        
        //Tests the doesNoseGlow method for each reindeer object
        System.out.println(num1.doesNoseGlow());
        System.out.println(num2.doesNoseGlow());
        System.out.println(num3.doesNoseGlow());
        
        //Tests the getEnergyLevel method for each reindeer object
        System.out.println(num1.getEnergyLevel());
        System.out.println(num2.getEnergyLevel());
        System.out.println(num3.getEnergyLevel());
        
        //Tests the changeName method for each reindeer object
        num1.changeName("qwertyui");
        num2.changeName("sdfghj");
        num3.changeName("zxvb");
        
        //Tests to see that the name of the reindeer obejct was changed
        System.out.println(num1.getName());
        System.out.println(num2.getName());
        System.out.println(num3.getName());
        
        //Tests the setNoseAbility method for each reindeer object 
        num1.setNoseAbility(false);
        num2.setNoseAbility(true);
        num3.setNoseAbility(true);
        
        //Tests to see that the nose ability of the reindeer objects was changed
        System.out.println(num1.doesNoseGlow());
        System.out.println(num2.doesNoseGlow());
        System.out.println(num3.doesNoseGlow());
        
        //Tests the changeEnergy method for each reindeer object 
        num1.changeEnergy(-100);
        num2.changeEnergy(9999);
        num3.changeEnergy(3);
        
        //Tests to see that the get energy level of the reindeer objects was changed
        System.out.println(num1.getEnergyLevel());
        System.out.println(num2.getEnergyLevel());
        System.out.println(num3.getEnergyLevel());
        
        //Tests the toString method for each reindeer object 
        System.out.println(num1.toString());
        System.out.println(num2.toString());
        System.out.println(num3.toString());
        
        //Tests the determineTeamHappiness method
        System.out.println(num1.determineTeamHappiness());
        
        
        
        
        
        
        
    }//end of main method 
}//end of LovejoyReinRunner class