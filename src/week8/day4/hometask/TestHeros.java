package week8.day4.hometask;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestHeros {
    public static void main(String[] args) {

        ArrayList<Superhero> heros = new ArrayList<>();

        heros.add(new Superman(Universe.DC));
        heros.add(new Rocket(Universe.MARVEL));
        heros.add(new Groot(Universe.MARVEL));
        heros.add(new Batman(Universe.DC));
        heros.add(new Ironman(Universe.MARVEL));

//        skyAttack(heros);
//        shootingAttack(heros);
        for(Superhero hero : heros){
            hero.attack();
            System.out.println("----------------------------");
        }
    }

    public static void skyAttack(ArrayList<Superhero> herosList){
        for(Superhero hero : herosList){
            if(hero instanceof IFlyable){
                ((IFlyable)hero).attackFromSky();
            }
        }
    }

    public static void shootingAttack(ArrayList<Superhero> herosList){
        for(Superhero hero : herosList){
            if(hero instanceof IShootable){
                ((IShootable)hero).shoot();
            }
        }
    }
}
