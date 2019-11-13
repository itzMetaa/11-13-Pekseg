
package peksegoop;

/**
 *
 * @author Diak
 */
public class Peksutemeny implements Arlap{

    private double alapAr;
    protected double mennyiseg;

    public Peksutemeny(double alapAr, double mennyiseg) {
        this.alapAr = alapAr;
        this.mennyiseg = mennyiseg;
    }
    
    
    @Override
    public double mennyibeKerul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
