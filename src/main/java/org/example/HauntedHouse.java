package org.example;

import java.util.List;
import java.util.Random;

public class HauntedHouse {

    private List<Guest> guestList;
    private List<BaseMonster> monsterList;
    private Random random;

    public HauntedHouse(List<Guest> guestList, List<BaseMonster> monsterList, Random random) {
        this.guestList = guestList;
        this.monsterList = monsterList;
        this.random = random;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public List<BaseMonster> getMonsterList() {
        return monsterList;
    }

    public void startHaunting() {
        // each guest should be scared by a random monster selected from the monsterList
        // if it gets too scary for a guest, remove the guest from the list

        /*for (Guest guest : guestList) {
            if (monsterList.get(random.nextInt(monsterList.size())).scare(guest)) {
                guestList.remove(guest);
            }
        }*/
        guestList.removeIf(Guest::isTooScared);
        guestList.removeIf(guest -> monsterList.get(random.nextInt(monsterList.size())).scare(guest));

        System.out.println(guestList);
    }
}
