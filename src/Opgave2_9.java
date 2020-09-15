import java.util.Scanner;

public class Opgave2_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1 ");
        System.out.print("and t : ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        

        double acceleration = values(v0, v1, t);
        System.out.print("The average acceleration is " + acceleration);

    }

    public static double values(double v0, double v1, double t) {
        double acceleration = (v1 - v0) / t;
        return acceleration;
    }
}
