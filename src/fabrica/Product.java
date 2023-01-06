package fabrica;

import java.util.Objects;

public class Product {
    private String name;
    private String type;
    private String madeIn;
    private int price;

    public Product(String  name , String type , String  madeIn , int price){
        this.name = name;
        this.type = type;
        this.madeIn = madeIn;
        this.price = price;
    }

    public Product(String nameProduct, String typeProduct, int priceProduct, String madeInProduct){}

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(type, product.type) && Objects.equals(madeIn, product.madeIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, madeIn, price);
    }
}
