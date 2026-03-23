package PartB;

public class Canard implements Combattant, Soignable {
    private final EspeceCanard espece;
    private final String surnom;
    private final int pvMax;
    private int pvActuels;
    private final int atk;

    public Canard(EspeceCanard espece, String surnom) {
        this.espece = espece;
        this.surnom = (surnom == null || surnom.isEmpty()) ? espece.getNom() : surnom;
        this.pvMax = espece.getPvBase();
        this.pvActuels = pvMax;
        this.atk = espece.getAtkBase();
    }

    @Override
    public void attaquer(Canard cible) {
        double mult = this.getType().getMultiplicateur(cible.getType());
        int degats = (int)(atk * mult);
        System.out.println(surnom + " attaque " + cible.getSurnom() + " ! x" + mult);
        cible.subirDegats(degats);
    }

    @Override
    public void subirDegats(int degats) {
        this.pvActuels = Math.max(0, this.pvActuels - degats);
    }

    @Override
    public boolean estKO() {
        return pvActuels <= 0;
    }

    @Override
    public void soigner() {
        this.pvActuels = pvMax;
    }

    public void finDeTour() {
        if (this.getType() == TypeCanard.PLANTE) {
            this.pvActuels = Math.min(pvMax, (int)(pvActuels * 1.1));
        }
    }

    @Override public int getPvActuels() { return pvActuels; }
    @Override public int getPvMax() { return pvMax; }
    @Override public String getSurnom() { return surnom; }
    public TypeCanard getType() { return espece.getType(); }
}