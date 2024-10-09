package org.example.prototype;

import lombok.ToString;

@ToString
public class Laptop extends Computer{
    private float chargeBackup;
    Laptop(String name, int price,float chargeBackup) {
        super(name, price);
        this.chargeBackup=chargeBackup;
    }

    public void setChargeBackup(float chargeBackup) {
        this.chargeBackup = chargeBackup;
    }

    public float getChargeBackup() {
        return chargeBackup;
    }

    @Override
    protected Laptop clone() throws CloneNotSupportedException {
        return (Laptop) super.clone();
    }
}
