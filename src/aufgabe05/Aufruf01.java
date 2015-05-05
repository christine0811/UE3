
package aufgabe05;

/**
 *
 * @author 
 */
public class Aufruf01 
{
    public static void main(String[] args)
    {
     Liste01<Benennbar01> a =  new Liste01(3);
     Benennbar01 b = new Car01();
     Benennbar01 c = new Boat01();
     Benennbar01 d = new Vehicle01();
     
     a.save(b);
     a.save(c);
     a.save(d);
   
     System.out.println(a.toString());
     
    } 
}
