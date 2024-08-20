import impl.Cats;
import impl.Dogs;

public class Main {

    public static Cats cats = new Cats(true);
    public static Dogs dogs = new Dogs(true);

    public static void main(String[] args) {
        cats.actions();
        dogs.actions();
    }
}
