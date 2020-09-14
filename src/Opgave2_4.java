import java.util.Scanner;

public class Opgave2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in sqare meters : ");
        double squareMeter = input.nextDouble();
        double ping = squareMeter * 0.3025;

        System.out.println(squareMeter + " square meters is " + ping + " pings ");







    }
}
