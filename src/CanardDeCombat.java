abstract class CanardDeCombat implements Soignable, Combattant{
    private final String nom;
    private String surnom;
    private final int pvMax;
    private int pvActuels;
    private int atk;

    static int nbCanardsCrees;
    static final int ATK_MIN = 1;

    CanardDeCombat(String nom, int pvMax, int atk) {
        this.nom = nom;
        this.surnom = nom;
        if (pvMax > 0) {
            this.pvActuels = pvMax;
            this.pvMax = pvMax;
        } else {
            this.pvActuels = 1;
            this.pvMax = 1;
        }
        if (atk >= ATK_MIN) this.atk = atk;
        CanardDeCombat.nbCanardsCrees++;
    }

    public String getNom() {
        return nom;
    }

    public String getSurnom() {
        return surnom;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getPvActuels() {
        return pvActuels;
    }

    public int getAtk() {
        return atk;
    }

    public static int getNbCanardsCrees() {
        return nbCanardsCrees;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public boolean estKO() {
        return pvActuels <= 0;
    }

    public void subirDegats(int degat) {
        pvActuels -= degat;
        if (pvActuels <= 0) pvActuels = 0;
        System.out.println(this.getNom() + " subit " + degat + " dégats! (PV: " + getPvActuels() + "/" + getPvMax() + ")");
    }

    public void soigner(){
        this.pvActuels = this.pvMax;
    }

    public String toString(){
        return "["+this.getType()+"] "+this.getNom()+ " <<"+this.getNom()+">> (PV: "+this.getPvActuels()+"/"+ this.getPvMax()+"| ATK:"+this.getAtk()+")";
    }
    abstract String getType();

    public abstract double etreAttaqueePar(CanardFeu attaquant);
    public abstract double etreAttaqueePar(CanardEau attaquant);
    public abstract double etreAttaqueePar(CanardPlante attaquant);
    public abstract double etreAttaqueePar(CanardNormal attaquant);

    public abstract void attaquer(CanardDeCombat cible);

    protected void effectuerAttaque(CanardDeCombat cible, double mult) {
        int degats = (int)(getAtk() * mult);
        System.out.println(getSurnom() + "  attaque " + cible.getSurnom()
                + " ! (" + getType() + " → " + cible.getType()
                + " : x" + mult + ") → " + degats + " dégâts");
        cible.subirDegats(degats);
    }
}
