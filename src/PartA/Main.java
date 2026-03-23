package PartA;

public class Main {
    public static void main(String[] args) {
        CanardDeCombat canard1 = new CanardFeu("Gérard", 39, 52);
        CanardDeCombat canard2 = new CanardConfus("Coin-Coin", 52, 48);
        CanardDeCombat canard3 = new CanardPlante("Fernand", 45, 49);

        CanardDeCombat canard4 = new CanardEau("Hubert", 44, 48,10);
        CanardDeCombat canard5 = new CanardNormal("Marcel", 50, 45);
        CanardDeCombat canard6 = new CanardFeu("Josette", 42, 55);

        Equipe equipe1 = new Equipe("Sacha");
        Equipe equipe2 = new Equipe("Ondine");

        equipe1.ajouter(canard1);
        equipe1.ajouter(canard2);
        equipe1.ajouter(canard3);

        equipe2.ajouter(canard4);
        equipe2.ajouter(canard5);
        equipe2.ajouter(canard6);


        System.out.println("=== ÉQUIPE de " + equipe1.getNomDresseur() + " ===");
        equipe1.afficher();
        System.out.println("=== ÉQUIPE de " + equipe2.getNomDresseur() + " ===");
        equipe2.afficher();

        System.out.println("\n=== COMBAT ===");
        Arene.combattre(equipe1, equipe2);

        System.out.println("\nNombre total de canards créés : " + CanardDeCombat.getNbCanardsCrees());
    }
}