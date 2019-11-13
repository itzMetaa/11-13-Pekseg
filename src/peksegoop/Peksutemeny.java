
package peksegoop;

/**
 *
 * @author Diak
 */
public abstract class Peksutemeny implements Arlap{

    private double alapAr;
    protected double mennyiseg;

    public Peksutemeny(double alapAr, double mennyiseg) {
        this.alapAr = alapAr;
        this.mennyiseg = mennyiseg;
    }
    
    public abstract void megkostol();
    
    @Override
    public double mennyibeKerul() {
        return alapAr * mennyiseg;
    }

    @Override
    public String toString() {
        return String.format("%f db - %f Ft", mennyiseg, this.mennyibeKerul());
    }
    
    
}
