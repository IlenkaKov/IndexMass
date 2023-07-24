public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double hightM = 1.87;
        double bmi = service.calculate(weightKg, hightM);
        System.out.println("Индекс массы тела" + bmi);


    }
}