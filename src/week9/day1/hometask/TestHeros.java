package week9.day1.hometask;

import java.util.ArrayList;

public class TestHeros {
    public static void main(String[] args) {

        Team team1 = new Team();

        team1.addSuperhero(new Batman(Universe.DC));
        team1.addSuperhero(new Groot(Universe.MARVEL));
        team1.addSuperhero(new Rocket(Universe.MARVEL));
        team1.addSuperhero(new Superman(Universe.DC));
        team1.addSuperhero(new Ironman(Universe.MARVEL));

        team1.removeSuperhero("Rocket");
        team1.removeSuperhero("Ironman");

        team1.skyAttack();
        team1.shootingAttack();

//        team1.removeSuperhero("Rocket");

    }
}
