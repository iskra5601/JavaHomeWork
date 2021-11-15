package com.pb.iskra.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка "+ " Стоимость: "+ getCoast()+" Цвет: " + getColor()+" Расмер: " + getSize()+" ");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка "+ " Стоимость: "+ getCoast()+" Цвет: " + getColor()+" Размер: " + getSize()+" ");


    }
}
