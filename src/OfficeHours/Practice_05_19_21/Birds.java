package OfficeHours.Practice_05_19_21;

public class Birds {
    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public boolean isFly() {
        return canFly;
    }

    public void setFly(boolean fly) {
        this.canFly = fly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        this.beakLength = beakLength;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "species = '" + species + '\'' +
                ", fly = " + canFly +
                ", beakLength = " + beakLength +
                '}';
    }
}
