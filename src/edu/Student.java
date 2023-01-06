package edu;

public class Student {
    private String name;
    private String surname;
    private byte age;

    public Student(String name , String surname , byte age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
