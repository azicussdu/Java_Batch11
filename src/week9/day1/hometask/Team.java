package week9.day1.hometask;

import java.util.ArrayList;

public class Team {
    private ArrayList<Superhero> herosList = new ArrayList<>();

    public void addSuperhero(Superhero hero){
        herosList.add(hero);
    }

    public void removeSuperhero(String heroName){
        for(Superhero hero : herosList){
            if(hero.getName().equalsIgnoreCase(heroName)){
                herosList.remove(hero);
                System.out.println("Hero: " + hero.getName() + " was removed");
                break;
            }
        }
    }

    public void skyAttack(){
        for(Superhero hero : herosList){
            if(hero instanceof IFlyable){
                ((IFlyable)hero).attackFromSky();
            }
        }
    }

    public void shootingAttack(){
        for(Superhero hero : herosList){
            if(hero instanceof IShootable){
                ((IShootable)hero).shoot();
            }
        }
    }

}
