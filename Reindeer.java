
/**
 * class Reindeer 
 * Learn GitHub version control for collaborative projects
 * Human Team Member Names: Will Z, Matilda L, Mikhael T, Jack W
 * December 19, 2019
 */
public class Reindeer
{
    // class variables (AKA member variables)
    private static int numOfReindeer = 0;
    private static int totalLights = 0;
    private static int totalEnergy = 0;
    
    // instance variables (AKA fields or attributes)
    private String name; 
    private boolean noseGlows;
    private int energy;  // 1 - 5 with 5 as the highest
    
    
    /**
     * 3-Args Constructor for objects of class Reindeer
     */
    public Reindeer(String theName, boolean theNoseGlows, int theEnergy)
    {
        // TO DO: initialise the reindeer's attributes
        name = theName;
        noseGlows = theNoseGlows;
        energy = theEnergy;
        
        // TO DO: update the class (static variables)
        numOfReindeer++;
        if(noseGlows)
        {
            totalLights++;
        }
        totalEnergy += energy;
        
    }
    
    // TODO: Write a getter method for each instance variable
    public String getName()
    {
        // TODO: code here
        return name;
    }
    
    public boolean doesNoseGlow()
    {
        // TODO: code here
        return noseGlows;
    }
    
    public int getEnergyLevel()
    {
        // TODO: code here
        return energy;
    }
    
    // TODO: Write a setter method for each instance variable
    public void changeName(String name)
    {
        // TODO: code here
        
    }
    
    public void setNoseAbility(boolean nG)
    {
        // TODO: code here (don't forget to also update totalLights)
        
    }
    
    public void changeEnergy(int amountOfChange)
    {
        // TODO: code here (don't forget to also update totalEnergy)
        
    }
    
    // interesting description of the reindeer
    public String toString()
    {
        // TODO: code here
        return "The name of the reindeer is " +name + ". " + name +"'s energy level is " +energy + ".  Does " + name + "'s nose glow: " + noseGlows;  
    }
    
    
    // method that returns the happiness of the entire team
    // of reindeer, based on any old combination of conditions
    // and or formulas using numOfReindeer, totalLights
    public String determineTeamHappiness()
    {
        // TODO: code here
        if(totalLights == 1)
        {
            return "The reindeer are happy to follow their leader!";
        }
        
        if(numOfReindeer > totalLights)
        {
            return "Reindeer aren't happy because of a lack of lights :(";
        }
        else if(numOfReindeer == totalLights)
        {
            return "There is a perfect amount of lights and the reindeer are enjoying life :)";
        }
        else if(numOfReindeer < totalLights)
        {
            return "Reindeer are stressed from excess lights!";
        }
        return "Reindeer are in a neutral mood!";
    }
        
}
