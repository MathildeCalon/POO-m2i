package org.example;

public class Chaise {
    // Attributs
    private int pieds = 4;
    private String materiau = "plastique";
    private String couleur = "noire";

    // Constructeur
    public Chaise(int pieds, String materiau, String couleur) {
        this.pieds = pieds;
        this.materiau = materiau;
        this.couleur = couleur;
    }

    // Méthodes
        @Override
        public String toString() {
            return "Je suis une chaise avec " + pieds + " pied(s) en " + materiau + " de couleur " + couleur;
        }
}
