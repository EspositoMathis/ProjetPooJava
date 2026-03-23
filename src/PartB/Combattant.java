package PartB;

public interface Combattant {
    void attaquer(Canard cible);
    void subirDegats(int degats);
    boolean estKO();
    String getSurnom();
}