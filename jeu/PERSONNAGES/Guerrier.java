package PERSONNAGES;

public class Guerrier extends Personnage {
    private int armure = 1;

    public Guerrier(String nom, int vie, int force, String metier, int armure) {
        // this.setNom();
        super(nom, metier, vie, force);
        this.setArmure(armure);
    }

    public Guerrier() {

    }

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

    public String fiche() {
        return super.fiche()
                + "\tPoints d'Armure:" + this.armure + "\n";
    }
}