

package aufgabe03;

import aufgabe02.Vehicle.Color;

/**
 *
 * @author 
 */
public class Aufruf1 
{
    
    public static void main(String[] args)
    { 
        Car1 bmw = new Car1((short) 4, Color.Silver, (short) 220, (short) 5, (short) 4);
        Car1 audi = new Car1((short) 4, Color.Black, (short) 180, (short) 5, (short) 8);   
        Boat1 titanic = new Boat1((short) 0, Color.Blue, (short) 51000, (short) 0, (short) 10.54, (short) 3, 100.000);
    
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());

     //Aufgabe 3
     Benennbar1 namedCar = new Car1(); 
     namedCar.setName("Sheela Breitfuss");
     System.out.println("Es heißt " + namedCar.getName());
    }          
}


