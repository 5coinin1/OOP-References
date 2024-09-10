package CLO2;

public class DiscreteSignal implements Signal {
    private final double amplitude;
    private final int time;

    public DiscreteSignal(double amplitude, int time) {
        this.amplitude = amplitude;
        this.time = time;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    // Tính toán tín hiệu x(n) tại thời điểm n theo định nghĩa x(n) = ∑ x(k) * δ(n-k)
    @Override
    public double getSignal(double n) {
        double sum = 0.0;

        // Tính δ(n-k): chỉ khi n == k thì δ(n-k) = 1, còn lại là 0
        if (n == time) {
            sum += amplitude; // x(k) * δ(n-k) = x(k) * 1 = x(k)
        }
        return sum;
    }
}
