package com.gupao.prototypedemo;

/**
 * @author yiran
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.setName("花花");
        Owner owner = new Owner();
        owner.setName("程怡然");
        sheep.setOwner(owner);
        sheep.setWeight(20);

        Scientist scientist = new Scientist();
        Sheep cloneSheep = scientist.cloneSheep(sheep);
        System.out.println(cloneSheep.getOwner());
        System.out.println(sheep.getOwner());

        Sheep otherCloneSheep = scientist.shallowClone(sheep);
        System.out.println(otherCloneSheep.getOwner());

        try {
            Sheep thirdCloneSheep = (Sheep) sheep.clone();
            System.out.println(thirdCloneSheep.getOwner());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
