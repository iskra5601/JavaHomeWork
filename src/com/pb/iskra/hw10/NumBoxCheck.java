package com.pb.iskra.hw10;

public class NumBoxCheck {

    public static void main(String[] args) {

        NumBox numBox = new NumBox(5);
        try {
            numBox.add(59.4, 0);
            numBox.add(68.9, 1);
            numBox.add(55.2, 2);


        } catch (Exception e) {
            System.err.println("Массив полон.Максимальное кол-во элементов массива - 5");
            e.printStackTrace();
        }
        numBox.average();
        System.out.println("Число в индексе 2: "+numBox.get(2));
        numBox.sum();
        numBox.length();
        numBox.max();
    }

}
