public class Cats implements Animals{
    @Override
    public boolean hungry() {
        return true;
    }

    @Override
    public String sound() {
        return "Moew moew ...";
    }
}
