package edu;

import java.util.HashSet;
import java.util.Set;

public class EducetionGroup {
    Set<Student> students = new HashSet<>();
    private String name;
    private int classs;

    public EducetionGroup(String name, int classs){
        this.name=name;
        this.classs=classs;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClasss() {
        return classs;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    public void addStudentInEducetionGroup(Student student){
        getStudents().add(student);
        System.out.println("Edukeshinga qabul qilindingiz");

    }
}
