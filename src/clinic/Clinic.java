package clinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private String addres;
    List<Doctor> doctors = new ArrayList<>();

    public Clinic(String name , String addres){
        this.name = name;
        this.addres = addres;
    }

    public Clinic(){}

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

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) { this.doctors = doctors; }


    public void addDocInClinic(Doctor doctor){
        getDoctors().add(doctor);
        System.out.println("Ishga qabul qilindingiz");
    }
}
