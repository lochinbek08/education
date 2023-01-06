package edu;

import java.util.HashSet;
import java.util.Set;

public class Educetion {
    Set<EducetionGroup>educetionGroups = new HashSet<>();
    private String name;
    private String addres;
    public Educetion(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }
    public Educetion(){}

    public Set<EducetionGroup> getEducetionGroups() {
        return educetionGroups;
    }

    public void setEducetionGroups(Set<EducetionGroup> educetionGroups) {
        this.educetionGroups = educetionGroups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
