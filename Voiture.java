
//methode : mot clé représente l'object courant , cest à dire l'objet depuis le quel on appelle la méthode. Donc thhis ne peut pas etre utilisé dans une méthode statique.

public class Voiture {
    // les modifucateurs(private, public et protected)
    public String marque;
    private String modele;
    private String couleur;

    public String getModele() {
        return modele;
    }

    public void setModele(String m) {
        if (m.length() < 10) {
            modele = m;
        }
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void afficheNb() {
        double pi = Math.PI;
        System.out.println("nb vaut" + Init.nb);
    }

    public void demarrer() {
        System.out.println("je démarre...");

    }
}