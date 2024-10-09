package org.example.prototype;

import lombok.ToString;

@ToString
public class Computer implements Cloneable{

    private String name;
    private int price;

    Computer(String name, int price){
        super();
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
