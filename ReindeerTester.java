
/**
 * Write a description of class ReindeerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReindeerTester
{
    public static void Main(String[] args)
    {
        Reindeer joe = new Reindeer("Joe" , false, 2);
        Reindeer bruh = new Reindeer("David", false, 4);
        Reindeer perry = new Reindeer("Mrs Perry :)", true, 3);
        
        System.out.println(perry.determineTeamHappiness());
    }
}
