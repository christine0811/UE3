

package aufgabe03;

import aufgabe02.Vehicle;


/**
 *
 * @author 
 */
public class Car1 extends Vehicle1
{
 
    private boolean aircondition;
    private short airbag;

    public Car1(short w, Color f, short ps, short d, short a)
    {
        super(w, f, ps, d);
        aircondition = false;
        airbag = a;
    }
    
    public Car1()
    {
        super();
    }

    Car1(short s, Vehicle.Color color, short s0, short s1, short s2)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void startAircondition()
    {
        if(aircondition = false)
        {
            aircondition = true;
        }
        
        else
        {
            System.out.println("Die Aircondition läuft bereits");
        }       
    }
    
    public void stopAircondition()
    {
        if(aircondition = true)
        {
            aircondition = false;
        }
        
        else
        {
            System.out.println("Die Aircondition ist bereits aus");
        }
    }

    public boolean isAircondition() 
    {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) 
    {
        this.aircondition = aircondition;
    }

    public short getAirbag()
    {
        return airbag;
    }

    public void setAirbag(short airbag) 
    {
        this.airbag = airbag;
    }

    @Override
    public String toString()
    {
       return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h"; 
    }   
}
