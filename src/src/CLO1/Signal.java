package CLO1;

public interface Signal {
    void addSample(int n, double amplitude);
    double calculate(int n);
}