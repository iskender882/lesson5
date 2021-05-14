package com.geektech;

import java.util.Random;

public class Hero {

    private String heroName = "Subzero";

    private int heroHealth =  150 ;
    private int heroDamage =  50 ;

     private String superPower = "100";

    public Hero(String heroName, int heroHealth, int heroDamage, String superPower) {
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superPower = superPower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public String getHeroName(){
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;

    }

    public int getHeroHealth() {
        return heroHealth;

    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;

    }

    public int getHeroDamage() {
        return heroDamage;

    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;

    }

    public String getSuperPower() {
        return superPower;

    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

}












