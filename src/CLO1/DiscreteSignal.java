package CLO1;
public class DiscreteSignal implements Signal {
    private final double amplitude;
    private final double frequency;
    private final double period;
    private final double wavelength;

    private final int[] nValues;       // Mảng chứa các giá trị n
    private final double[] amplitudes; // Mảng chứa các giá trị biên độ tương ứng x(n)
    private int size;            // Số lượng mẫu tín hiệu

    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength, int capacity) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
        this.nValues = new int[capacity];  // Khởi tạo mảng để lưu trữ các giá trị n
        this.amplitudes = new double[capacity];  // Khởi tạo mảng biên độ
        this.size = 0; // Ban đầu chưa có mẫu tín hiệu nào
    }

    // Phương thức để thêm một mẫu tín hiệu tại thời điểm n với biên độ tương ứng
    public void addSample(int n, double amplitude) {
        if (size < nValues.length) {
            nValues[size] = n;
            amplitudes[size] = amplitude;
            size++;
        } else {
            System.out.println("Đã đạt tới giới hạn của tín hiệu.");
        }
    }

    // Phương thức tính giá trị tín hiệu x(n) dựa trên công thức tổng
    public double calculate(int n) {
        double result = 0.0;
        for (int i = 0; i < size; i++) {
            result += amplitudes[i] * delta(n - nValues[i]);
        }
        return result;
    }

    // Hàm delta Dirac (hàm xung đơn vị), trả về 1 nếu n == k, ngược lại 0
    private int delta(int value) {
        return (value == 0) ? 1 : 0;
    }

    // Phương thức để lấy biên độ
    @Override
    public double getAmplitude() {
        return amplitude;
    }

    // Phương thức để lấy tần số (frequency)
    @Override
    public double getFrequency() {
        return frequency;
    }

    // Phương thức để lấy chu kỳ
    @Override
    public double getPeriod() {
        return period;
    }

    // Phương thức để lấy bước sóng
    @Override
    public double getWavelength() {
        return wavelength;
    }
}