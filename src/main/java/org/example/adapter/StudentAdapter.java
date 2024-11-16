package org.example.adapter;

public class StudentAdapter implements Student{
    private SchoolStudent schoolStudent;
    StudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }
    @Override
    public int getId() {
        return schoolStudent.getId();
    }

    @Override
    public String getName() {
        return schoolStudent.getName();
    }

    @Override
    public String getAddress() {
        return schoolStudent.getAddress();
    }
}
