package PartB;

public enum TypeCanard {
    FEU("Feu"), EAU("Eau"), PLANTE("Plante"), NORMAL("Normal"), ELECTRIQUE("Electrique");

    private final String libelle;

    TypeCanard(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }

    public double getMultiplicateur(TypeCanard cible) {
        double[][] table = {
                {0.5, 0.5, 2.0, 1.0, 1.0}, // FEU
                {2.0, 0.5, 0.5, 1.0, 1.0}, // EAU
                {0.5, 2.0, 0.5, 1.0, 1.0}, // PLANTE
                {1.0, 1.0, 1.0, 1.0, 1.0}, // NORMAL
                {1.2, 1.2, 1.2, 1.2, 1.0}  // ELECTRIQUE
        };
        return table[this.ordinal()][cible.ordinal()];
    }
}