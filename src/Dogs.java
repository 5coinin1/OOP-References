public class Dogs implements Animals {

    @Override
    public boolean hungry() {
        return true;
    }

    @Override
    public String sound() {
        return "Gau gau...";
    }
}
