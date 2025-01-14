public class test {
    public static void main(String[] args) {
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
        guerrier.setForce(10); // Devrait être ajusté à 5
        guerrier.setVie(0); // Devrait être ajusté à 1

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
    }
}
