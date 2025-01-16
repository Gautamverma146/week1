import java.util.*;

public class GenerateCalendar {
// Mtehod for geting month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
// method checking if year is leap year or not

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
// Method for days
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; 
        
        return d0;
    }
	//method for displaying Calendar

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);  
            if ((day + firstDay) % 7 == 0) {
                System.out.println();  
            }
        }
// Adding extra line
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input month form user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
		//taking input year from user
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        displayCalendar(month, year);
        
        sc.close();
    }
}
