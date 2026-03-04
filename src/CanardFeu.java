public class CanardFeu extends CanardDeCombat{

    CanardFeu(String nom, int pvMax, int atk) {
        super(nom, pvMax, atk);
    }

    @Override
    String getType() {
        return "Feu";
    }

    @Override
    public double etreAttaqueePar(CanardFeu attaquant) { return 0.5; }

    @Override
    public double etreAttaqueePar(CanardEau attaquant) { return 2.0;}

    @Override
    public double etreAttaqueePar(CanardPlante attaquant) { return 0.5;}

    @Override
    public double etreAttaqueePar(CanardNormal attaquant) { return 1.0; }

    @Override
    public void attaquer(CanardDeCombat cible) {
        double mult = cible.etreAttaqueePar(this);
        effectuerAttaque(cible,mult);
    }
}
