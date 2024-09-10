import CLO1.DiscreteSignal;
import CLO1.Radar;

public class Main {

    public static void main(String[] args) {
        // Tạo một tín hiệu rời rạc với dung lượng tối đa là 10 mẫu
        DiscreteSignal discreteSignal = new DiscreteSignal(2.0, 50.0, 20.0, 10.0, 10);
        var radar = new Radar(discreteSignal);
        // Thêm các mẫu tín hiệu vào
        discreteSignal.addSample(0, 2.0);
        discreteSignal.addSample(1, 4.0);
        discreteSignal.addSample(2, 6.0);

        // Tính và in ra giá trị của tín hiệu tại các thời điểm khác nhau
        System.out.println("x(1) = " + discreteSignal.calculate(1)); // Kết quả sẽ là 4.0
        System.out.println("x(2) = " + discreteSignal.calculate(2)); // Kết quả sẽ là 6.0
        System.out.println("x(0) = " + discreteSignal.calculate(0)); // Kết quả sẽ là 2.0
        // Phân tích tín hiệu
        radar.analyze();

        // In ra giá trị của tín hiệu tại các thời điểm khác nhau
        radar.printSignalValues();
    }
}