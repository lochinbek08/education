package fabrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fabrica {
    List<Worker> workers = new ArrayList<>();

    private String name;

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    private String addres;

    public Fabrica(String name , String addres){
        this.name = name;
        this.addres = addres;
    }

    public Fabrica(){}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabrica fabrica = (Fabrica) o;
        return Objects.equals(name, fabrica.name) && Objects.equals(addres, fabrica.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addres);
    }

    public void addWorekerInFabrica(Worker worker){
        getWorkers().add(worker);
        System.out.println("Ishga qabul qilindingiz");
    }
}
