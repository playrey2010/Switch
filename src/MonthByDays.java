import java.util.Scanner;

public class MonthByDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days;
        System.out.print("Input amount of days in month(s): ");
        days = sc.nextInt();

        switch (days) {
            case 28:
                System.out.println("February");
                break;
            case 29:
                System.out.println("February (leap year)");
                break;
            case 30:
                System.out.println("April, June, September, November");
                break;
            case 31:
                System.out.println("January, March, May, July, August, October, December");
                break;
            default:
                System.out.println("There are no months with exactly " + days + " days."  );
        }
    }
}
