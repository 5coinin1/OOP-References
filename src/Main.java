import impl.Cats;
import impl.Dogs;

public class Main {

    public static Cats cats = new Cats(false);
    public static Dogs dogs = new Dogs(true);

    public static void main(String[] args) {
        if (cats.hungry()) {
            System.out.println(cats.sound());
        }
        if (dogs.hungry()) {
            System.out.println(dogs.sound());
        }
    }
}
