package PartB;

public class EspeceCanard {
    private final String nom;
    private final TypeCanard type;
    private final int pvBase;
    private final int atkBase;

    public EspeceCanard(String nom, TypeCanard type, int pvBase, int atkBase) {
        this.nom = nom;
        this.type = type;
        this.pvBase = pvBase;
        this.atkBase = atkBase;
    }

    public String getNom() { return nom; }
    public TypeCanard getType() { return type; }
    public int getPvBase() { return pvBase; }
    public int getAtkBase() { return atkBase; }

    public static final EspeceCanard CANARD_FEU = new EspeceCanard("Canard Feu", TypeCanard.FEU, 39, 52);
    public static final EspeceCanard CANARD_EAU = new EspeceCanard("Canard Eau", TypeCanard.EAU, 44, 48);
    public static final EspeceCanard CANARD_PLANTE = new EspeceCanard("Canard Plante", TypeCanard.PLANTE, 45, 49);
    public static final EspeceCanard CANARD_NORMAL = new EspeceCanard("Canard Normal", TypeCanard.NORMAL, 50, 44);
    public static final EspeceCanard CANARD_ELEC = new EspeceCanard("Canard Electrique", TypeCanard.ELECTRIQUE, 55, 41);
}