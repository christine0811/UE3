
package aufgabe04;

/**
 *
 * @author 
 */

public class Aufruf 
{
    public static void main(String[] args)
    {
        Liste eins = new Liste(3);
        eins.save(2.5);
        eins.save(5.0);
        eins.save(200.0);
     
        System.out.println(eins.toString());
    }   
}
