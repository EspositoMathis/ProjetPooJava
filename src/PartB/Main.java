package PartB;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INITIALISATION COIN-COIN ARENA (PARTIE B) ===");

        Equipe equipe1 = new Equipe("Rouge");
        Equipe equipe2 = new Equipe("Bleu");
        // Equipe 1
        equipe1.ajouter(new Canard(EspeceCanard.CANARD_FEU, "Gérard"));
        equipe1.ajouter(new Canard(EspeceCanard.CANARD_EAU, "Hubert"));
        equipe1.ajouter(new Canard(EspeceCanard.CANARD_ELEC, "David"));

        //Equipe 2
        equipe2.ajouter(new Canard(EspeceCanard.CANARD_NORMAL, "Marcel"));
        equipe2.ajouter(new Canard(EspeceCanard.CANARD_PLANTE, "Fernand"));
        equipe2.ajouter(new Canard(EspeceCanard.CANARD_PLANTE, "Colette"));

        System.out.println("=== ÉQUIPE de " + equipe1.getNomDresseur() + " ===");
        equipe1.afficher();
        System.out.println("=== ÉQUIPE de " + equipe2.getNomDresseur() + " ===");
        equipe2.afficher();

        System.out.println("\n=== COMBAT ===");
        Arene.combattre(equipe1, equipe2);
    }


}