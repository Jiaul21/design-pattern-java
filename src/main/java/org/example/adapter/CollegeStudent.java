package org.example.adapter;

public class CollegeStudent implements Student{
    private int id;
    private String name;
    private String address;

    public CollegeStudent(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
