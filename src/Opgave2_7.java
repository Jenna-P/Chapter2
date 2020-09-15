import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes : ");
        int minutes = input.nextInt();

        int year = minutes / 525600;
        //60 * 24 = 1440min (1day)
        //1440 * 365 = 525600min (1year)
        int day = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes os approximately "
        + year + " years and " + day + "days");
    }
}
