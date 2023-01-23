public class BMIService {
    public double calculate(double weight, double height) {
        double IM = weight / (height * height);

        return IM;
    }

}
