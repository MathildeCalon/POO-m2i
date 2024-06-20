package org.example;

public class Joueur {
    private String name;
    private int level = 1;
    private int xp;

    public Joueur(String name, int level, int xp){
        this.name = name;
        this.level = level;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }

    public void finishQuest(){
        this.xp += 10;
        if(this.xp>100) {
            this.level += 1;
            this.xp = 0;
        }
    }
}
