public class CanardEau extends CanardDeCombat{
    private final int jet;

    CanardEau(String nom, int pvMax, int atk, int jet) {
        super(nom, pvMax, atk);
        this.jet = jet;
    }

    @Override
    String getType() {
        return "Eau";
    }

    @Override
    public double etreAttaqueePar(CanardFeu attaquant) { return 0.5; }

    @Override
    public double etreAttaqueePar(CanardEau attaquant) { return 0.5;}

    @Override
    public double etreAttaqueePar(CanardPlante attaquant) { return 2.0;}

    @Override
    public double etreAttaqueePar(CanardNormal attaquant) { return 1.0; }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        effectuerAttaque(cible,mult);
    }
    public int pressionJet(){
        System.out.println("Jet d'eau (pression: "+ this.jet +") !");
        return this.jet;
    }

}
