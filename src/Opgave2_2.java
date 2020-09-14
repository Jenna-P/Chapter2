import java.util.Scanner;

public class Opgave2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of sides and height of the Equilateral triangle : ");
        double lengthOfSides = input.nextDouble();
        double height = input.nextDouble();  //dnt know this part

        double area = (Math.sqrt(3) / 4) * lengthOfSides;
        double volume = area * height;

        System.out.println("The area is " + area);
        System.out.println("The volume of the trianrular is " + volume);
    }
}
