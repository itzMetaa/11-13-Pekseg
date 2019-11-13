
package peksegoop;


public class Kave implements Arlap{

    private boolean habosE;

    public Kave(boolean habosE) {
        this.habosE = habosE;
    }
    
    @Override
    public double mennyibeKerul() {
        return this.habosE? Arlap.CSESZEKAVE*1.5: Arlap.CSESZEKAVE;
    }

    @Override
    public String toString() {
        return "Kave" + (habosE? "Habos ": "Nem habos") + this.mennyibeKerul();
    }
    
}
