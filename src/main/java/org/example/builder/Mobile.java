package org.example.builder;

public class Mobile {

    private String name;
    private String brand;
    private int price;
    private String os;

    Mobile(){}

    private Mobile(Builder builder){            // used for builder only
        this.name=builder.name;
        this.brand=builder.brand;
        this.price=builder.price;
        this.os=builder.os;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                '}';
    }

    public static class Builder{

        private String name;
        private String brand;
        private int price;
        private String os;


        public Builder setName(String name) {
            this.name=name;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand=brand;
            return this;
        }

        public Builder setPrice(int price) {
            this.price=price;
            return this;
        }

        public Builder setOs(String os) {
            this.os=os;
            return this;
        }

        public Mobile build(){
            return new Mobile(this);
        }

    }
}


