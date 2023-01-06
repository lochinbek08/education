package fabrica;

import java.util.Objects;

public class Worker {
    private String name;
    private String lastname;
    private int phoneNumber;
    private String addres;
    private String mutaxasis;
    private byte age;

    public Worker(String name , String lastname , String addres , String mutaxasis , int phoneNumber , byte age){
        this.name = name;
        this.lastname = lastname;
        this.mutaxasis = mutaxasis;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public Worker(String nameWorker, String surnameWorker, int phoneNumberWorker, String addresWorker, String msWorker, byte ageWorker){}

    public Worker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getMutaxasis() {
        return mutaxasis;
    }

    public void setMutaxasis(String mutaxasis) {
        this.mutaxasis = mutaxasis;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return phoneNumber == worker.phoneNumber && age == worker.age && Objects.equals(name, worker.name) && Objects.equals(lastname, worker.lastname) && Objects.equals(addres, worker.addres) && Objects.equals(mutaxasis, worker.mutaxasis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phoneNumber, addres, mutaxasis, age);
    }
}
