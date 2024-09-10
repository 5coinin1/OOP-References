package CLO1;

public class Radar {
    private DiscreteSignal signal;

    public Radar(DiscreteSignal signal) {
        this.signal = signal;
    }

    // Phương thức để phân tích tín hiệu với mẫu tín hiệu rời rạc đã cho
    public void analyze() {
        // Phân tích và tính toán giá trị của tín hiệu theo công thức X(n)
        for (int n = 0; n <= 15; n++) {
            double x_n = (n >= 0 && n <= 15) ? (1 - n / 15.0) : 0;
            signal.addSample(n, x_n);
        }
    }

    // Phương thức để in ra giá trị của tín hiệu tại các thời điểm khác nhau
    public void printSignalValues() {
        for (int n = 0; n <= 15; n++) {
            System.out.println("x(" + n + ") = " + signal.calculate(n));
        }
    }
}