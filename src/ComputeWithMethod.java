public class ComputeWithMethod {
    public static void main(String[] args) {

        //konkatenering
        String beregningsType = "areal";

        System.out.println("Beregner " + beregningsType + "med metoder");

        System.out.println("Arealer for radius 2 er " + beregnAreal(2));
        System.out.println("Arealer for radius 5 er " + beregnAreal(5));

        double toCirkler = beregnAreal(3) + beregnAreal(5);
        System.out.println("Summen af arealet af 2 cirkler : " + toCirkler);


    }
        public static double beregnAreal(double radius) {
            double areal = radius * radius * Math.PI;
            return areal;

    }
}
