package com.pb.iskra.hw7;

    public abstract class  Clothes {

    protected Size size;
    protected int coast;
    protected String color;
    protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

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




        }
