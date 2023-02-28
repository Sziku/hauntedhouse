package org.example;

public class Ghost extends BaseMonster{
    public Ghost() {
        super(0, 0, 33);
    }

    @Override
    public boolean scare(Guest guest) {
        guest.setScaredLevel(guest.getScaredLevel() + 33);

        return guest.getScaredLevel() > 100 || guest.getEnergyLevel() < 25 || guest.getHealthLevel() < 4;
    }
}
