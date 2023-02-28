package org.example;

public class Demon extends BaseMonster{
    public Demon() {
        super(-10, 0, 7);
    }

    @Override
    public boolean scare(Guest guest) {
        guest.setHealthLevel(guest.getHealthLevel() - 10);
        guest.setScaredLevel(guest.getScaredLevel() + 7);

        return guest.getScaredLevel() > 100 || guest.getEnergyLevel() < 25 || guest.getHealthLevel() < 4;
    }
}
