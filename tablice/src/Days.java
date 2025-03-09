import java.util.Scanner;

public class Days {
    Days() {}
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        int month = new Scanner(System.in).nextInt();


        while (year <= 1852) {
            year = new Scanner(System.in).nextInt();
        }

        while (month < 1 || month > 12) {
            month = new Scanner(System.in).nextInt();
        }

        int days = switch (month) {
            case 1,3,5,7,8,10,12 -> days = 31;
            case 4,6,9,11 -> days = 30;
            default -> throw new IllegalArgumentException("Invalid month");
        };

        System.out.println("days: " + days);
    }
}
