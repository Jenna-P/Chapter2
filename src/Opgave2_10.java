import java.util.Scanner;

public class Opgave2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms : ");
        System.out.println("Enter tje initial temperature : ");
        System.out.println("Enter the final temperature : ");

        double M = input.nextDouble();
        double initialT = input.nextDouble();
        double finalT = input.nextDouble();

        double Q = M * (finalT - initialT) * 4184;

        System.out.println("The energy neede is " + Q);
    }
}
