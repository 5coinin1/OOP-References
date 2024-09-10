public class ContinuousSignal implements Signal {
    private final double amplitude;
    private final double frequency;
    private final double period;
    private final double wavelength;

    public ContinuousSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
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

    @Override
    public double getValue(double t) {
        return amplitude * Math.sin(2 * Math.PI * frequency * t);
    }
}
