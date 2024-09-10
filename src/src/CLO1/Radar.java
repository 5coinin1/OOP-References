package CLO1;

public class Radar {
    private final DiscreteSignal signal;

    public Radar(DiscreteSignal signal) {
        this.signal = signal;
    }

    // Add samples only if there's enough space in the signal
    public void analyze() {
        for (int n = 0; n <= 15; n++) {
            double x_n = 1 - n / 15.0; // Formula [2]
            signal.addSample(n, x_n);
        }
    }

    public void printSignalValues() {
        for (int n = 0; n <= 15; n++) {
            System.out.println("x(" + n + ") = " + signal.calculate(n));
        }
    }
}
