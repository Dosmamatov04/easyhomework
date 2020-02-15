package com.company;

public class Magical extends Player implements InterfaceMy {

    public Magical(int Health,int Damage,String Ability[],int MagicalHit) {
        super(Health, Damage, Ability);


    }

    public Magical() {

    }


    @Override
    public String SuperAble(String superJump) {
        return superJump+"Прыжок на 113.5 метров выше и дальше.";
    }
}

