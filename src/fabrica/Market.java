package fabrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Market {
    private String name;
    private String addres;
    private int number;
    List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Market(String name , String addres , int number){
        this.name = name;
        this.addres = addres;
        this.number = number;
    }

    public Market(){}

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return number == market.number && Objects.equals(name, market.name) && Objects.equals(addres, market.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addres, number);
    }
    public void addProductInMarket(Product product){
        getProducts().add(product);
        System.out.println("Mahsulot qabul qilindi");
    }
}
