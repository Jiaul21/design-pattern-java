package org.example.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        ComputerRegistry cr=new ComputerRegistry();



        Computer computer=(Computer) cr.getComputer("LAPTOP");
        System.out.println(computer.getName()+" "+computer.getPrice()+" "+computer);

        Computer computer1=(Desktop) cr.getComputer("DESKTOP");
        System.out.println(computer1.getName()+" "+computer1.getPrice()+" "+computer1);

        Laptop laptop= (Laptop) cr.getComputer("LAPTOP");       // down casting to access child class methods
        System.out.println(laptop.getChargeBackup());
    }
}
