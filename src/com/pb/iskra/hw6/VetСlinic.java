package com.pb.iskra.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Horse Ivan = new Horse();
        Cat Vasia = new Cat();
        Dog Fedor = new Dog();

        Horse Ivan3 = new Horse();
        Cat Vasia3 = new Cat();
        Dog Fedor3 = new Dog();


        Ivan.setColor("коричневый");
        Ivan.setAge("4");
        Ivan.setBreed("Зариканская");
        Ivan.setName("Плотва");
        Ivan.setFood("Овёс");
        Ivan.setLocation("Поле");

        Vasia.setColor("черно-белый");
        Vasia.setAge("8");
        Vasia.setBreed("Дворняга");
        Vasia.setName("Рыжик");
        Vasia.setFood("Мышей");
        Vasia.setLocation("Чердак");


        Fedor.setColor("Черный");
        Fedor.setAge("5");
        Fedor.setBreed("Лабрадор");
        Fedor.setName("Матвей");
        Fedor.setFood("Соседских уток");
        Fedor.setLocation("Будка");

        Ivan3.setColor("коричневый");
        Ivan3.setAge("4");
        Ivan3.setBreed("Зариканская");

        Vasia3.setColor("черно-белый");
        Vasia3.setAge("8");
        Vasia3.setBreed("Дворняга");

        Fedor3.setColor("Черный");
        Fedor3.setAge("5");
        Fedor3.setBreed("Лабрадор");

        System.out.println("сравнение Федоров " + Fedor.equals(Fedor3));
        System.out.println("сравнение Иванов " + Ivan.equals(Ivan3));
        System.out.println("сравнение Василиев " + Vasia.equals(Vasia3));

        System.out.println("сравнение Федоров " + Fedor.equals(Fedor3));
        System.out.println("сравнение Иванов " + Ivan.equals(Ivan3));
        System.out.println("сравнение Василиев " + Vasia.equals(Vasia3));

        System.out.println("hashCode Василия: " + Vasia.hashCode());
        System.out.println("hashCode второго Василия: " + Vasia3.hashCode());

        Animal[] animals = new Animal[]{Ivan, Vasia, Fedor};

        for (Animal a : animals) {
            a.goTo();

        }
         Class cl = Veterinarian.class;

        Class clazz = Class.forName("com.pb.iskra.hw6.Veterinarian");

        Constructor constr = cl.getConstructor();

        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            ((Veterinarian) obj).treatAnimal(Ivan);
        }

    }
}
//В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
//Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//Dog, Cat, Horse переопределяют методы makeNoise, eat.
//Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.

//В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.

//Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
//Пусть этот метод печатает на экран food и location пришедшего на прием животного.

//Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//В цикле отправляйте животных на прием к ветеринару.
//Объект класса Veterinarian создайте с помощью рефлексии.