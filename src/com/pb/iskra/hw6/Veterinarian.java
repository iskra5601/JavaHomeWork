package com.pb.iskra.hw6;

public class Veterinarian{
    Animal animal = new Animal();


    public static void treatAnimal (Animal animal) {

        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());

    }

}
//Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
//Пусть этот метод печатает на экран food и location пришедшего на прием животного.
