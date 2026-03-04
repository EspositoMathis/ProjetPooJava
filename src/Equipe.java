public class Equipe {
    private CanardDeCombat[] equipe;
    private final String nomDresseur;
    public static int nbEquipesCrees;

    public Equipe(String nomDresseur) {
        this.nomDresseur = nomDresseur;
        this.equipe = new CanardDeCombat[6];
        nbEquipesCrees++;
    }

    public boolean ajouter(CanardDeCombat c){
        for (int i = 0; i < equipe.length; i++) {
            if (equipe[i] == null) {
                equipe[i] = c;
                return true;
            }
        }
        return false;
    }

    public void retirer(String surnom) {
        for (int i = 0; i < equipe.length; i++) {
            if (equipe[i] != null && equipe[i].getSurnom().equals(surnom)) {
                for (int j = i; j < equipe.length - 1; j++) {
                    equipe[j] = equipe[j + 1];
                }
                equipe[equipe.length - 1] = null;
                return;
            }
        }
    }
    public CanardDeCombat getPremierValide(){
        return this.equipe[0].estKO() ? null : this.equipe[0];
    }

    public String getNomDresseur() {
        return nomDresseur;
    }

    public CanardDeCombat[] getEquipe() {
        return equipe;
    }

    public void soignerTous(){
        for (int i = 0; i < equipe.length; i++) {
            if (equipe[i] != null) {
                equipe[i].soigner();
            }
        }
    }

    public void afficher(){
        for (int i = 0; i < equipe.length; i++) {
            CanardDeCombat c = equipe[i];
            if (c != null) {
                System.out.println(i + " "+c.getSurnom()+" (PV: " + c.getPvActuels()+"/"+c.getPvMax());
            }
        }
    }
    public boolean toutKO(){
        for (int i = 0; i < equipe.length; i++) {
            if (equipe[i] != null && ! equipe[i].estKO()) {
                return false;
            }
        }
        return true;
    }
}
