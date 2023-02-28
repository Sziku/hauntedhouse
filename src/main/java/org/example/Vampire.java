package org.example;

public class Vampire extends BaseMonster{

    public Vampire() {
        super(0, -40, 0);
    }

    @Override
    public boolean scare(Guest guest) {
        guest.setEnergyLevel(guest.getEnergyLevel() - 40);

        return guest.getScaredLevel() > 100 || guest.getEnergyLevel() < 25 || guest.getHealthLevel() < 4;
    }
}
