package com.pb.iskra.hw7;

public class Skirt extends Clothes implements WomenClothes {




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
    public void dressWomen() {
        System.out.println( "Женская юбка. " + "Стоимость:"+ getCoast()+" Цвет:" + getColor()+" Размер:" + getSize()+" ");


    }
}
