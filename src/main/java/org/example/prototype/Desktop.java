package org.example.prototype;

import lombok.ToString;

@ToString
public class Desktop extends Computer{
    private String monitor;
    Desktop(String name, int price,String monitor) {
        super(name, price);
        this.monitor=monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    protected Desktop clone() throws CloneNotSupportedException {
        return (Desktop) super.clone();
    }
}
