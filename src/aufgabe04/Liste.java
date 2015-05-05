
package aufgabe04;

/**
 *
 * @author 
 */

public class Liste<L> 
{
    L[] array; //Eindimensionales Array

    public Liste(int size)
    {
        array = (L[]) (new Object[size]);
    }

    public void save(L value) 
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == null) 
            {
                array[i] = value;
                System.out.println("Es wurde gespeichert");
                break;
            }
        }

    }

    @Override
    public String toString() 
    {
        String listenInhalt = ""; //leerer String indem ich die Inhalte speichere
        
        for (L a : array) 
        {
            listenInhalt += a + "\n"; //a = das wird reingeschrieben
        }
        
        return listenInhalt;
    }
}
