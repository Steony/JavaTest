public class Init {

    // une méthode static est une méthode liée à l'object.pas de this, car pas
    // compatible avec methode static.
    public static int nb = 5; // Déclarer une variable globale avec static

    public static void main(String[] args) {
        // Déclaration d'une variable
        Voiture v1 = new Voiture();
        v1.marque = "Ferrari";
        v1.setModele("Testarossa");
        v1.couleur = "rouge";
        System.out.println("Marque : " + v1.marque);
        System.out.println("Modèle : " + v1.getModele());
        System.out.println("NB initial = " + nb);

        // utilisation fonctions plusDix. mettre dans la classs fonctions.
        Fonctions.plusDix(nb);

        // fonction ecrire
        Fonctions.ecrire(" ça marche!");

        // Boucle pour incrémenter nb
        int i;
        for (i = 0; i < 10; i++) {
            nb++;
            System.out.println("i = " + i);
        }
        System.out.println("Sortie de la boucle, NB = " + nb);

        // Ajouter une valeur à nb
        ajouter(7);
        System.out.println("NB après ajout de 7 = " + nb);
    }

    // Méthode qui prend un argument de type int
    public static void ajouter(int nbAjouter) {
        int nb = 0;
        Init.nb += nbAjouter; // Modifie directement la variable globale nb
    }

}