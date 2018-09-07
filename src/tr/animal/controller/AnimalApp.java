package tr.animal.controller;

import tr.animal.entity.*;

// mur mur

public class AnimalApp {

    public static void main(String[] args) {
        Animal a1 = new Dog("Sharik");
        Animal a2 = new Dog("Tuzik");
        Animal a3 = new Cat("Pushok");

        Animal[] animals = {a1, a2, a3};
        for (Animal a : animals) {
            System.out.print(a.getName() + " ");
            a.sound();
        }
    }
}
