
package peksegoop;


public class Pogacsa extends Peksutemeny{

    public Pogacsa(double alapAr, double mennyiseg) {
        super(alapAr, mennyiseg);
    }

    @Override
    public void megkostol() {
        super.mennyiseg*=0.5;
    }

    @Override
    public String toString() {
        return "Pogácsa: " + super.toString();
    }

    
    
    
}
