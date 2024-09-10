import CLO1.DiscreteSignal;
import CLO1.Radar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a DiscreteSignal with a maximum capacity of 16 samples
        DiscreteSignal discreteSignal = new DiscreteSignal(16);
        Radar radar = new Radar(discreteSignal);

        // Add individual samples
        //discreteSignal.addSample(0, 2.0);
        //discreteSignal.addSample(1, 4.0);
        //discreteSignal.addSample(2, 6.0);

        // Print individual signal calculations
        //System.out.println("x(1) = " + discreteSignal.calculate(1)); // Expected: 4.0
        //System.out.println("x(2) = " + discreteSignal.calculate(2)); // Expected: 6.0
        //System.out.println("x(0) = " + discreteSignal.calculate(0)); // Expected: 2.0

        var n = Arrays.asList(0, 1, 2, 3);
        var amplitude = Arrays.asList(2.0, 4.0, 6.0, 8.0);

        // Add multiple samples at once
        discreteSignal.addSamples(n, amplitude);

        for (int time : n) {
            System.out.println("x(" + time + ") = " + discreteSignal.calculate(time));
        }

        // Perform radar analysis and print the signal values
        radar.analyze();
        radar.printSignalValues();
    }
}