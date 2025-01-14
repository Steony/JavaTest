import PERSONNAGES.Guerrier;
import PERSONNAGES.Mage;
import PERSONNAGES.Personnage;
import PERSONNAGES.Sorcier;

public class test { // Nom de classe corrigé pour respecter les conventions Java

    public static void main(String[] args) {
        // Création des personnages principaux
        Guerrier conan = new Guerrier("Conan", 100, 18, "Barbare", 1);
        Mage gandalf = new Mage("Gandalf", 100, 18);

        Sorcier hp = new Sorcier("Harry Potter", "élève", 50);
        conan.attaque(hp);
        hp.attaque(conan);

        // Affichage des fiches
        System.out.println(conan.fiche());
        System.out.println(gandalf.fiche());

        System.out.println("----------------------------");

        // Utilisation de la méthode toString() pour un affichage personnalisé
        System.out.println(conan + " - Nom : " + conan.getNom());
        System.out.println(gandalf + " - Nom : " + gandalf.getNom());
    }

    public static void main2(String[] args) {
        // Création des personnages
        Personnage persoGuerrier = new Personnage();
        persoGuerrier.setNom("Conan");
        persoGuerrier.setMetier("Barbare");
        persoGuerrier.setForce(18);
        persoGuerrier.setVie(100);

        Mage persoMage = new Mage();
        persoMage.setNom("Gandalf");
        persoMage.setMetier("Vagabond");
        persoMage.setForce(9);
        persoMage.setVie(90);
        persoMage.setMana(100);

        Guerrier guerrier = new Guerrier();
        guerrier.setNom("Achille");
        guerrier.setMetier("Guerrier");
        guerrier.setForce(5); // Ajustement pour respecter les restrictions de force
        guerrier.setVie(1); // Ajustement pour respecter les restrictions de vie

        // Affichage des points de vie de Conan avant l'attaque
        System.out.println("Points de vie de " + persoGuerrier.getNom() + " : " + persoGuerrier.getVie());

        // Gandalf attaque Conan
        System.out.println(persoMage.getNom() + " attaque " + persoGuerrier.getNom());
        persoMage.attaque(persoGuerrier);

        // Affichage des points de vie de Conan après l'attaque
        System.out.println("Il reste " + persoGuerrier.getVie() + " points de vie à " + persoGuerrier.getNom());

        // Conan contre-attaque
        System.out.println(persoGuerrier.getNom() + " contre-attaque !");
        persoGuerrier.attaque(persoMage);

        // Affichage des points de vie de Gandalf après l'attaque
        System.out.println("Il reste " + persoMage.getVie() + " points de vie à " + persoMage.getNom());

        // Affichage des caractéristiques du guerrier
        System.out.println(guerrier.getNom() + " - Force : " + guerrier.getForce() + ", Vie : " + guerrier.getVie());

        // Création de personnages supplémentaires
        Personnage perso1 = new Personnage("Aragorn", "Rodeur", 14, 90);
        Guerrier perso2 = new Guerrier("Mad Martigan", 80, 12, "Mercenaire", 2);
    }
}
