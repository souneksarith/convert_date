import java.util.Scanner;
public class convert_date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input short data (YYYY-MM-DD) : ");
        String sdate = input.next();
        String[] dates = sdate.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        String monthName = getMonthName(month);
        System.out.println("Full Date: " + monthName + " " + day + ", " + year);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}
