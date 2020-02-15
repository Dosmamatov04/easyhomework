package com.company;

public class Mental extends Player implements InterfaceMy {

    public Mental(int Health,int Damage,String Ability[],int brainCount){
        super(Health,Damage,Ability);



    }

    public Mental() {

    }


    @Override
    public String SuperAble(String superJump) {
        return superJump+"Прыжок на 15 метров выше и дальше.";



    }
}
