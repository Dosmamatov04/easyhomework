package com.company;




public class Player {
private int Health;
private int Damage;

private String Ability[]={"Warrior","Magical","intellective"};


public Player(int Health,int Damage,String Ability[]){
     this.Health=Health;
     this.Damage=Damage;
     this.Ability=Ability;


 }

     public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String[] getAbility() {
        return Ability;
    }

    public void setAbility(String[] ability) {
        Ability = ability;
    }
}
