package com.pb.iskra.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String color;
    private String breed;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void makeNoise() {

        System.out.println("Собага говорит Гав и грызет ботинки");

    }
    public void sleep() {

        System.out.println("Собака сейчас спит");

    }
    public void eat(String food) {

        System.out.println("Собака ест " + food);

    }
    public void goTo(){

        System.out.println("Собака идет к ветеринару");

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color) && Objects.equals(breed, dog.breed) && Objects.equals(age, dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, breed, age);
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