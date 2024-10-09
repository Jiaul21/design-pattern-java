package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class ComputerRegistry {

    private static Map<String, Computer> computers=new HashMap<>();
    static {
        computers.put("LAPTOP",new Laptop("Hp 05",500,5));
        computers.put("DESKTOP",new Desktop("Hp 05",500,"UHD"));
    }

    public Computer getComputer(String computer) throws CloneNotSupportedException {
        return (Computer) computers.get(computer).clone();
    }
}
