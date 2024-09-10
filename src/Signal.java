public interface Signal {
    double getAmplitude();  // Biên độ
    double getFrequency();  // Tính thường xuyên
    double getPeriod();     // Chu kỳ
    double getWavelength(); // Bước sóng

    double getValue(double t);
}