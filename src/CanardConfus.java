import java.util.Random;

public class CanardConfus extends CanardEau {

    private boolean enrage;
    CanardConfus(String nom, int pvMax, int atk) {
        super(nom, pvMax, atk,10);
        enrage=false;
    }

    @Override
    public String toString() {
        return super.toString() +"MM";
    }

    @Override
    public void attaquer(CanardDeCombat cible) {
        Random rng = new Random();
        if (rng.nextInt(4) == 0) {
            System.out.println(this.getNom() + " est confus ! Il se cogne la tête... Coin Coin ?");
        } else {
            super.attaquer(cible);
            enrage = false;
        }

    }

    public void Migraine(){
        System.out.println(this.getNom() + " se tient la tête... COIN. COIN.");
        this.enrage = true;
    }
}
