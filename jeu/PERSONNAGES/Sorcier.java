package PERSONNAGES;

public class Sorcier extends Mage {

    private Integer magieNoire;

    public Sorcier(String nom, int force, int vie) {
        super(nom, force, vie);
    }

    public Sorcier() {
    }

    public int getMagieNoire() {
        return magieNoire;
    }

    public void setMagieNoire(int magieNoire) {
        this.magieNoire = magieNoire;
    }

    public String fiche() {
        return super.fiche()
                + "\tPoints Magie" + this.magieNoire + "\n";
    }

}
