import java.util.Scanner;

public class Opgave2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");

        int number = input.nextInt();

        int t1 = 1 + (number-100) / 100;
        int t2 = (1 + (number-10) / 10) % 10;
        int t3 = number % 10;

        int  product = t1 * t2 * t3;

        System.out.println("The multiplication of all digit in " + number + " is " + product);


    }
}
