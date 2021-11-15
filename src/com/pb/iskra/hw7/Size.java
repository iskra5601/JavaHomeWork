package com.pb.iskra.hw7;

public enum Size {

    XXS("32"),
    XS("34"),
    S("36"),
    M("38"),
    L("40");


    private String euroSize;

    Size(String euroSize) {
        this.euroSize = euroSize;
    }


    public String getDescription() {
        if (euroSize.equals("32")) {
            return "Детский размер";
        } else {
            return "Взрослый размер";

        }

    }

    public void getEuroSize() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
