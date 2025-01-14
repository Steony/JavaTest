package PERSONNAGES;

//abstract class est une classe qu'o nne peut pas instancier et mettre new 
public abstract class Personnage {
    private String nom;
    private String metier;
    private int force;
    // protected package: rend le membre de la classe visible dans toutes les
    // classes du même dossier package.
    protected int vie;

    /**
     * un constructeur est une méthode qui permet de " construire " (=instancier) un
     * objet d'une classe.
     * il est appelé avec le mot-clé new
     * Il n'y a pas de type de retour de la définition (=signature) de la méthode.
     * le nom du constructeur est le nom de la classe
     * 
     * @param nom    String
     * @param metier String
     * @param force  int
     * @param vie    int
     */
    public Personnage(String nom, String metier, int force, int vie) {
        this.nom = nom;
        this.metier = metier;
        this.force = force;
        this.vie = vie;
    }

    // dans une classe on peut avoir plusieurs méthodes avec le même nom. ON APELLE
    // CA LA SURCHARGE(overload)
    // la signature doit être différente en ce qui concerne les arguments, soit en
    // nombre soit en type.

    public Personnage(String nom, int force, int vie) {
        this.nom = nom;
        this.force = force;
        this.vie = vie;
    }

    // \n retour à la ligne
    public String fiche() {
        return "Fiche Personnage \n"
                + "----------------------"
                + "\tNom : " + this.nom + "\n"
                + "\tMétier :" + this.metier + "\n"
                + "\tPoints de Force :" + this.force + "\n"
                + "\tPoints de Vie :" + this.vie;

    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    // ajouter pour que dans test pour que le constructeur soit pris en compte/
    // dès que l'on définit un constructeur dans une classe ,le constructeur par
    // défaut (sans argument) n'est plus accessible.
    // Pour le rentre accessible à nouveau, il faut le déclarer explicitement dans
    // la classe.
    public Personnage() {
    }

    public void attaque(Personnage cible) {
        // EXO: les points de vie de la cible vont être diminué
        // des points de force de l'attaquant (this)

        // cible.vie -= this.force;
        cible.setVie(cible.getVie() - this.force);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
