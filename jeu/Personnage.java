public class Personnage {
    private String nom;
    private String metier;
    private int force;
    private int vie;

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

    // ajouter pour que dans test pour que le constructeur soit pris en compte
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
