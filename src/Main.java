public class Main {

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(7, 55, 10);

        t1.setHour(12).setMinute(32).setSecond(23);

        System.out.println("t1 is " + t1);
        System.out.println("t2 is " + t2);
    }
}
