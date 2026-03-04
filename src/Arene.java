public class Arene {

    public static void combattre(Equipe e1, Equipe e2) {
        int tour = 1;

        while (!e1.toutKO() && !e2.toutKO()) {
            System.out.println("=== TOUR " + tour + " ===");

            CanardDeCombat c1 = e1.getPremierValide();
            CanardDeCombat c2 = e2.getPremierValide();

            if (c1 != null && c2 != null) {
                System.out.println("Tour " + tour + " : " + c1.getSurnom() + " attaque " + c2.getSurnom() + " !");
                c1.attaquer(c2);
                if (c2.estKO()) {
                    System.out.println(c2.getSurnom() + " est KO !");
                    e2.retirer(c2.getSurnom());
                }
            }

            if (c2 != null && !c2.estKO() && c1 != null) {
                c2.attaquer(c1);
                if (c1.estKO()) {
                    System.out.println(c1.getSurnom() + " est KO !");
                    e1.retirer(c1.getSurnom());
                }
            }

            for (CanardDeCombat c : e1.getEquipe()) {
                if (c instanceof CanardPlante && !c.estKO()) {
                    ((CanardPlante) c).soigner();
                }
            }
            for (CanardDeCombat c : e2.getEquipe()) {
                if (c instanceof CanardPlante && !c.estKO()) {
                    ((CanardPlante) c).soigner();
                }
            }

            tour++;
        }

        if (e1.toutKO()) {
            System.out.println("L'équipe " + e2.getNomDresseur() + " est victorieuse !");
        } else if (e2.toutKO()) {
            System.out.println("L'équipe " + e1.getNomDresseur() + " est victorieuse !");
        }
    }
}