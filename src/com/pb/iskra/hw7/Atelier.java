package com.pb.iskra.hw7;

public class Atelier {
    public static void main(String[] args) {



        Skirt skirt = new Skirt();
        skirt.setColor("Красная Унисекс");
        skirt.setSize(Size.XXS);
        skirt.setCoast(2500);


        Pants pants = new Pants();
        pants.setColor("Серые Унискес");
        pants.setSize(Size.M);
        pants.setCoast(1000);

        Tie tie = new Tie();
        tie.setColor("Голубой с уточками");
        tie.setSize(Size.S);
        tie.setCoast(1200);

        Tshirt tshirt = new Tshirt();
        tshirt.setColor("Синяя с аистом");
        tshirt.setSize(Size.L);
        tshirt.setCoast(500);

        Clothes[] clothes = new Clothes[]{skirt, pants, tie, tshirt};

        dressMan(clothes);
        dressWomen(clothes);
    }


    public static void dressMan(Clothes[] clothes) {

        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {

                ManClothes menClothe = (ManClothes) clothe;
                menClothe.dressMan();
                ((ManClothes) clothe).dressMan();


            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {

        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                WomenClothes womenClothes = (WomenClothes) clothe;
                womenClothes.dressWomen();
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }

    }

//Создать пакет hw7 и в нем создать перечисление (enum) Size со
// значениями XXS, XS, S, M, L. Перечисление содержит метод getDescription(),
// возвращающий строку для XXS "Детский размер", для остальных "Взрослый размер".
// Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение (32, 34, 36, 38, 40)
// соответствующее каждому размеру. Создать конструктор принимающий на вход description и euroSize.
//
//
//Создать интерфейсы
//- ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
//- WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
//Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
//
//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.
//
//
//Создать класс Atelier с методом main, и еще двумя статическими методами:
//dressMan(Clothes[] clothes)
//dressWomen(Clothes[] clothes)
//на вход которых будет поступать массив, содержащий все типы одежды.
//В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
//Метод dressWomen выводит на консоль всю информацию о женской одежде.
//Метод dressMan выводит на консоль всю информацию о мужской одежде.
//В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.
//
//
//По желанию можно использовать внутренние классы.


