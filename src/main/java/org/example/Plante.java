package org.example;

public class Plante {
    protected String name;
    protected int height;
    protected String leafColour;

    public Plante(String name, int height, String leafColour) {
        this.name = name;
        this.height = height;
        this.leafColour = leafColour;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getLeafColour() {
        return leafColour;
    }
    public void setLeafColour(String leafColour) {
        this.leafColour = leafColour;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Je suis un.e " + this.name + ", de hauteur " + this.height + " mètres, et mes feuilles sont " + this.leafColour + ".";
    }
}
