//void main() {
//    System.out.println("Debut");
//
//    CanardFeu cf = new CanardFeu("Gerard",35,10);
//    CanardEau ce = new CanardEau("Hubert",35,10,1);
//    cf.attaquer(ce);
//    ce.attaquer(cf);
//    System.out.println("Fin");
//}

public class Main {
    public static void main(String[] args) {
        // Crée les canards
        CanardDeCombat canard1 = new CanardFeu("Gérard", 39, 52);
        CanardDeCombat canard2 = new CanardConfus("Coin-Coin", 52, 48);
        CanardDeCombat canard3 = new CanardPlante("Fernand", 45, 49);

        CanardDeCombat canard4 = new CanardFeu("Josette", 42, 55);
        CanardDeCombat canard5 = new CanardNormal("Marcel", 50, 45);
        CanardDeCombat canard6 = new CanardFeu("Hubert", 44, 48);

        // Crée les équipes
        Equipe equipe1 = new Equipe("Sacha");
        Equipe equipe2 = new Equipe("Ondine");

        equipe1.ajouter(canard1);
        equipe1.ajouter(canard2);
        equipe1.ajouter(canard3);

        equipe2.ajouter(canard4);
        equipe2.ajouter(canard5);
        equipe2.ajouter(canard6);

        // Affiche les équipes
        System.out.println("=== ÉQUIPE de " + equipe1.getNomDresseur() + " ===");
        equipe1.afficher();

        System.out.println("=== ÉQUIPE de " + equipe2.getNomDresseur() + " ===");
        equipe2.afficher();

        // Lancer le combat
        System.out.println("\n=== COMBAT ===");
        Arene.combattre(equipe1, equipe2);

        // Afficher le nombre de canards créés
        System.out.println("\nNombre total de canards créés : " + CanardDeCombat.getNbCanardsCrees());
    }
}