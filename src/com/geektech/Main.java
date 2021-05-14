package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here]
        Boss bossName = new Boss("Sckarpion", 350, 60);
        Hero heroName = new Hero("Subzero",150,50,"100");

        System.out.println(bossName.getBossName() + " " + bossName.getBossHealth() +
                " " + bossName.getBossDamage());


        System.out.println(heroName.getHeroName() + " " + heroName.getHeroHealth() +
                " " + heroName.getHeroDamage() + " " + heroName.getSuperPower());

    }
}
