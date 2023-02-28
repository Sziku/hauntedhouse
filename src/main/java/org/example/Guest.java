package org.example;

public class Guest {
    private int scaredLevel = 0;
    private int energyLevel = 100;
    private int healthLevel = 100;
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public int getScaredLevel() {
        return scaredLevel;
    }

    public void setScaredLevel(int scaredLevel) {
        this.scaredLevel = scaredLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public boolean isTooScared(){
        return healthLevel < 4 || scaredLevel > 100 || energyLevel < 25;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "scaredLevel=" + scaredLevel +
                ", energyLevel=" + energyLevel +
                ", healthLevel=" + healthLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
