package enums;

enum Car{
    Cobalt("Avtomat"),Lasetti("Enamarka"),Captiva("Metan");

    String action;

    Car(String name){
        this.action = name;
    }
    String getAction(){
        return action;
    }
}

public class Enum {

    public static void main(String[] args) {
        Car car = Car.Captiva;
        System.out.println(car);
        for (Car car1 :Car.values()){
            System.out.println(car1);
        }
    }
}
