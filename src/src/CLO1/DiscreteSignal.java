package CLO1;

import java.util.List;

public class DiscreteSignal implements Signal {
    private final int[] nValues;
    private final double[] amplitudes;
    private int size;

    public DiscreteSignal(int capacity) {
        this.nValues = new int[capacity];
        this.amplitudes = new double[capacity];
        this.size = 0; // samples should start at zero
    }

    // Add a sample at time n with a corresponding amplitude
    @Override
    public void addSample(int n, double amplitude) {
        // Check if the n value already exists
        for (int i = 0; i < size; i++) {
            if (nValues[i] == n) {
                // Update the amplitude for the existing n
                amplitudes[i] = amplitude;
                return;
            }
        }
        // Add new sample if n does not exist
        if (size < nValues.length) {
            nValues[size] = n;
            amplitudes[size] = amplitude;
            size++;
        } else {
            throw new IllegalStateException("Signal capacity exceeded.");
        }
    }

    // Add multiple samples at once
    public void addSamples(List<Integer> nValuesList, List<Double> amplitudeList) {
        if (nValuesList.size() != amplitudeList.size()) {
            throw new IllegalArgumentException("Mismatched list sizes.");
        }
        for (int i = 0; i < nValuesList.size(); i++) {
            var n = nValuesList.get(i);
            var amplitude = amplitudeList.get(i);
            if (n == null) {
                System.out.println("Auto Add sample when n is null");
                continue;
            }
            addSample(n, amplitude);
        }
    }

    // Calculate the signal value x(n) based on the formula [1]
    @Override
    public double calculate(int n) {
        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += amplitudes[i] * delta(n - nValues[i]);
        }
        return result;
    }

    // Dirac delta function: returns 1 if value == 0, otherwise 0
    public int delta(int value) {
        return (value == 0) ? 1 : 0;
    }
}
