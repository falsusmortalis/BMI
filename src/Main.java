public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double weight = 63;
        double height = 1.66;
        double IM = service.calculate(weight, height);

        System.out.println("Значение Индекса Массы Тела: " + IM);
    }
}
