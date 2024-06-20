package org.example;

public class Film {
    private String titre;
    private String realisateur;
    private int release;
    private String genre;

    public Film(String titre, String realisateur, int release, String genre){
        this.titre = titre;
        this.realisateur = realisateur;
        this.release = release;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getRelease() {
        return release;
    }
    public void setRelease(int release) {
        this.release = release;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.titre + " " + this.realisateur + " " + this.release + " " + this.genre ;
    }
}
