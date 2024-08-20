package api;

public abstract class Animals implements IAnimals {
    public final boolean hungry;
    public final String sound;

    public Animals(boolean hungry, String sound) {
        this.hungry = hungry;
        this.sound = sound;
    }

    @Override
    public boolean hungry() {
        return hungry;
    }

    @Override
    public String sound() {
        return sound;
    }
}
