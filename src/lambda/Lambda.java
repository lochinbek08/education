package lambda;

interface school{
    void pupil();

    void pupil(int name);

    void books(String name);
}

public class Lambda implements school{

    @Override
    public void pupil() {
        System.out.println("Ahror");
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.pupil();
        lambda.pupil( 11);
        lambda.books("Ahror sani amakivachchangmas");

    }

    @Override
    public void pupil(int name) {
        System.out.println(name);
    }

    @Override
    public void books(String name) {
        System.out.println(name);
    }

}
