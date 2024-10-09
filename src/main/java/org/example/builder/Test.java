package org.example.builder;

public class Test {
    public static void main(String[] args) {

        Mobile m= new Mobile.Builder()
                .setName("galaxy A20s")
                .setBrand("Samsung")
                .setPrice(20000)
                .setOs("Android 14")
                .build();

        Mobile m2= new Mobile();
        System.out.println(m2);

        System.out.println(m);
    }
}
