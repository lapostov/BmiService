public class bodyMassIndex {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 78;
        int height = 176;
        double index = service.calculate (mass, height);
        System.out.println(index);

    }



}
