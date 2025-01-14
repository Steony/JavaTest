package PERSONNAGES;

public class Mage extends Personnage {
    private int mana;

    public Mage(String nom, String metier, int force, int vie, int mana) {
        super(nom, metier, force, vie);
        this.mana = mana;
    }

    // Getter pour mana
    public int getMana() {
        return mana;
    }

    // Setter pour mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    // Constructeur par défaut
    public Mage() {
        super(); // Appel au constructeur par défaut de la classe parente
        this.mana = 0; // Valeur par défaut pour mana
    }

    // Constructeur avec toutes les propriétés

    // Constructeur avec nom, force, vie et une valeur par défaut pour mana
    public Mage(String nom, int force, int vie) {
        super(nom, "Mage", force, vie); // Métier par défaut défini comme "Mage"
        this.mana = 50; // Valeur par défaut pour mana
    }

    // Constructeur simplifié pour définir uniquement mana
    public Mage(int mana) {
        super(); // Appel au constructeur par défaut de la classe parente
        this.mana = mana;
    }

    // Constructeur sans métier explicite mais avec mana
    public Mage(String nom, int force, int vie, int mana) {
        super(nom, "Mage", force, vie); // Métier par défaut défini comme "Mage"
        this.mana = mana;
    }

    public String fiche() {
        return super.fiche()
                + "\tPoints de Mana" + this.mana + "\n";
    }
}
