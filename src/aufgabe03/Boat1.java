

package aufgabe03;

import aufgabe02.Vehicle;


/**
 *
 * @author 
 */
public class Boat1 extends Vehicle1
{
 
    private short draft;
    private short probeller;
    private double cargo;

    
    public Boat1(short w, Color f, short ps, short d, short draft, short probeller, double cargo)
    {
        super(w, f, ps, d);
        this.draft = draft;
        this.probeller = probeller;
        this.cargo = cargo;
    }

    Boat1(short s, Vehicle.Color color, short s0, short s1, short s2, short s3, double d)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void unload() throws InterruptedException
    {
        cargo = 0;
        Thread.sleep(5000);
    }

    public short getDraft()
    {
        return draft;
    }

    public void setDraft(short draft) 
    {
        this.draft = draft;
    }

    public short getProbeller()
    {
        return probeller;
    }

    public void setProbeller(short probeller) 
    {
        this.probeller = probeller;
    }

    public double getCargo() 
    {
        return cargo;
    }

    public void setCargo(double cargo) 
    {
        this.cargo = cargo;
    }

    @Override
    public String toString() 
    {
        return "Mein Wasserfahrzeug hat " + getPs() +  " PS und fährt mit " + getSpeed() + " km/h";
    }
}
