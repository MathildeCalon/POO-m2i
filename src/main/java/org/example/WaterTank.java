package org.example;

public class WaterTank {
    private int emptyWeight;
    private int maxCapacity;
    private int filling =0;

    // STATIC
    private static int totalFilling;

    public WaterTank(int emptyWeight, int maxCapacity, int filling) {
        this.emptyWeight = emptyWeight;
        this.maxCapacity = maxCapacity;
        this.filling = filling;
    }

    public double fill(int volume){
        int excessWater =0;
        if(this.filling<this.maxCapacity) {
            this.filling += volume;
            totalFilling += volume;
        } else {
            excessWater = volume - maxCapacity;
        }
        return excessWater;
    }

    public void affichageCiterne()
    {
        String[][] citerneAscii = {
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│            │",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
                {"┌──────O─────┐",
                        "│~~~~~~~~~~~~│",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "│            │",
                        "└────────────┘"},
        };
        int niveauCiterne = this.filling == 1 ? 1 : (this.filling * 8 / this.maxCapacity);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(citerneAscii[niveauCiterne][i]);
        }
    }

    public double empty(double volume){
        double waterTaken;
        if(this.filling<volume){
            waterTaken = this.filling;
            this.filling = 0;
        } else {
            this.filling -= volume;
            waterTaken = volume;
        }
        totalFilling -= volume;
        return waterTaken;
    }

    public double totalTank(){
        return this.filling + this.emptyWeight;
    }

    public double getFilling() {
        return filling;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public static double getTotalFilling() {
        return totalFilling;
    }
}
