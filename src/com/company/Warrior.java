package com.company;

public class Warrior extends Player implements InterfaceMy {

    public Warrior(int Health, int Damage, String Ability[], int Crit) {
        super(Health, Damage, Ability);


    }

    public Warrior() {
        super();
    }


    @Override
    public String SuperAble(String superJump) {
        return superJump + "Прыжок на 12 метров выше и дальше.";
    }
}