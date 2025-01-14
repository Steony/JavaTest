
// EXO ecrire class guerrier hésite de la classe Personnage. valeur propriété doit être comprise entre 1 et 5 

public class Guerrier extends Personnage {
    private int armure = 1;

    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        if (armure >= 1 && armure <= 5) {
            this.armure = armure;
        } else if (armure < 1) {
            this.armure = 1;
        } else {
            this.armure = 5;
        }

    }
}