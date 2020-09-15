import java.util.Scanner;

public class Opgave2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of year : ");

        int year = input.nextInt();

        int time = 3600 * 24 * 365 * year;  // Calculate 1 year in second
        int born = time / 7;  // Born in 1 year
        int death = time / 13;  // Death in 1 year
        int immigrant = time / 45;  // Immigrant in 1 year

        final int current_population = 312032486;

        int population = current_population + born  + immigrant - death;


        System.out.println("the population in " + year + "years is " + population);


    }
}
