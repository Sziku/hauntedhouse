package org.example;

public abstract class BaseMonster {
    private int setHealthLevel;
    private int setEnergyLevel;
    private int setScaredLevel;


    public BaseMonster(int setHealthLevel, int setEnergyLevel, int setScaredLevel) {
        this.setHealthLevel = setHealthLevel;
        this.setEnergyLevel = setEnergyLevel;
        this.setScaredLevel = setScaredLevel;
    }

    public abstract boolean scare(Guest guest);

}
