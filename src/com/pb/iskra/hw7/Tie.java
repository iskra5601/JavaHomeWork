package com.pb.iskra.hw7;

public class Tie extends Clothes implements ManClothes {

    private Size size;
    private int coast;
    private String color;

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
        System.out.println("Мужской галстук" + " Стоимость: "+ getCoast()+" Цвет: " + getColor()+" Размер:" + getSize()+" ");
    }

}
