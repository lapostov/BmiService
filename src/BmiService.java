public class BmiService {

   public double calculate(double mass, double height) {
        double index = mass / height;
        return (double) index;
    }

}
