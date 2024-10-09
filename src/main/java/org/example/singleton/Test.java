package org.example.singleton;

public class Test {

    public static void main(String[] args) {
        Ston obj1= Ston.INSTANCE;
        Ston obj2= Ston.INSTANCE;

        if(obj2==obj1){
            System.out.println("Same");
        }
        else{
            System.out.println("not same");
        }

        obj1.setI(5);
        System.out.println(obj2.getI());
    }

}
