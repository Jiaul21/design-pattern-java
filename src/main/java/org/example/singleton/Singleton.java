package org.example.singleton;

enum Ston{          // way 5 using enums that is thread safe automatically
    INSTANCE;       // it has by default private constructor

    private int i;
    public void setI(int i){
        this.i=i;
    }
    public int getI(){
        return i;
    }
}

public class Singleton {

                    // way 4
    public static Singleton obj;
    private Singleton(){}
    public static Singleton getInstance(){    // synchronized block in Double Check Locking blocks multiple thread at a time
        if(obj==null) {                                     // and reduce blocking time
            synchronized (Singleton.class){
                if(obj==null) obj=new Singleton();
            }
        }
        return obj;
    }


                // way 3
//    public static Singleton obj;
//    private Singleton(){}
//    public static synchronized Singleton getInstance(){    // synchronized keyword blocks multiple thread at a time
//        if(obj==null) obj=new Singleton();                  // but it takes lots of time when lots of thread
//        return obj;
//    }

                // way 2
//    public static Singleton obj;
//    private Singleton(){}
//    public static Singleton getInstance(){          // Lazy initialization
//        if(obj==null) obj=new Singleton();
//        return obj;
//    }

                // way 1
//    public static Singleton obj=new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){    // Eager initialization
//        return obj;
//    }
}
