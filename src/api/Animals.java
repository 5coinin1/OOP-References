package api;

public abstract class Animals {
    public final boolean hungry;
    public final String sound;

    public Animals(boolean hungry, String sound) {
        this.hungry = hungry;
        this.sound = sound;
    }

    public void actions() {
        if (hungry) {
            System.out.println(sound);
        }
    }
}
