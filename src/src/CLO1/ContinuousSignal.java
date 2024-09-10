package CLO1;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSignal implements Signal {
    private final List<Double> tValues;  // Time values
    private final List<Double> amplitudes; // Corresponding amplitudes
    private int size;

    public ContinuousSignal() {
        this.tValues = new ArrayList<>();
        this.amplitudes = new ArrayList<>();
        this.size = 0;
    }

    @Override
    public void addSample(int t, double amplitude) {
        tValues.add((double) t);
        amplitudes.add(amplitude);
        size++;
    }

    @Override
    public double calculate(int t) {
        // For simplicity, we assume linear interpolation between sample points
        if (size == 0) {
            throw new IllegalStateException("No samples added to signal.");
        }

        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += amplitudes.get(i) * interpolationFunction(t, tValues.get(i));
        }
        return result;
    }

    private double interpolationFunction(double t, double tSample) {
        // Simplified linear interpolation function for continuous signals
        return 1.0 / (1.0 + Math.abs(t - tSample));
    }
}
