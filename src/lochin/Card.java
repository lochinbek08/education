package lochin;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String CompanyName;
    private int password;
    private int number;
    private List<Double> income = new ArrayList<>();
    private List<Double> inout = new ArrayList<>();

    public Card(String companyName , int password , int number) {
        this.CompanyName = CompanyName;
        this.number = number;
        this.password = password;

    }

    public Card() {

    }

    public String getCompanyName(){
        return CompanyName;
    }
    public int getPassword(){
        return password;
    }
    public int getNumber(){
        return number;
    }
    public void setCompanyName(String companyName){
        this.CompanyName=companyName;
    }
    public void setPassword(int password){this.password=password;}
    public void setNumber(int number){this.number=number;}
}
