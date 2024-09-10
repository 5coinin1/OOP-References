package CLO2;

public class DiscreteSignal implements Signal {
    private final double amplitude;
    private final double frequency;
    private final double period;
    private final double wavelength;
    private final double[] signal;
    private final double sampleRate;

    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength, double[] signal) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
        this.signal = signal;
        this.sampleRate = wavelength / amplitude;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }

    public double getSampleRate() {
        return sampleRate;
    }

    public double[] getSignal() {
        return signal;
    }
}
