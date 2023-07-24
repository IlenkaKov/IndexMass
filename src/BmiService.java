public class BmiService {
    public double calculate(int weightKg, double hightM) {
        double bmi = weightKg / (hightM * hightM);
        return (int) bmi;

    }
}

