import java.util.Scanner;

public class Opgave2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of sides of the Equilateral triangle : ");
        double lengthOfSides = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * lengthOfSides;
        double volume = area * lengthOfSides; // ved ikke length og lengthofside er samme

        System.out.println("The area is " + area);
        System.out.println("The volume of the trianrular is " + volume);
    }
}
