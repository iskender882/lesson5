package com.geektech;

public class Boss {
    private String bossName = "Sckarpion";

    private int bossHealth = 350;
    private int bossDamage = 100;

    public Boss(String bossName, int bossHealth, int bossDamage) {
        this.bossName = bossName;
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }
}
