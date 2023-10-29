package lab01;

// Write a program to display the number of days of a month, which is entered by users (both month and year).
// If it is an invalid month/year, ask the user to enter again.

import java.util.Scanner;

public class DayOfMonth {
    public static String [][]months = new String[5][12];

    // Check if year is valid
    public static boolean checkYear(String year) {
        // Check if year is not a number
        for (int i = 0; i < year.length(); i++) {
            if (year.charAt(i) < 48 || year.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    // Check if month is valid
    // Return index of month
    public static int checkMonth(String month) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (months[i][j].equals(month)) {
                    return j;
                }
            }
        }

        // Return -1 when month is invalid
        return -1;
    }

    // Check if a year is leep
    public static boolean checkLeapYear(String year) {
        int yearNum = Integer.parseInt(year);

        if (yearNum % 4 != 0) {
            return false;
        }

        return yearNum % 100 != 0 || yearNum % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year, month;
        int monthNum;

        // Generate the name and date of months
        months[0][0] = "January"; months[4][0] = "31";
        months[0][1] = "February"; months[4][1] = "28";
        months[0][2] = "March"; months[4][2] = "31";
        months[0][3] = "April"; months[4][3] = "30";
        months[0][4] = "May"; months[4][4] = "31";
        months[0][5] = "June"; months[4][5] = "30";
        months[0][6] = "July"; months[4][6] = "31";
        months[0][7] = "August"; months[4][7] = "31";
        months[0][8] = "September"; months[4][8] = "30";
        months[0][9] = "October"; months[4][9] = "31";
        months[0][10] = "November"; months[4][10] = "30";
        months[0][11] = "December"; months[4][11] = "31";

        for (int i = 0; i < 12; i++) {
            // Add the case Jan, Feb, etc.
            months[2][i] = months[0][i].substring(0, 3);

            // Add the case Jan., Feb., Sept., etc.
            months[1][i] = months[2][i] + (i == 8 ? "t" : "") + ".";

            // Add the case 1, 2, 3, etc.
            months[3][i] = Integer.toString(i + 1);
        }

        // Input year
        do {
            System.out.print("Year: ");
            year = scanner.next();
        } while (!checkYear(year));

        // Input month
        do {
            System.out.print("Month: ");
            month = scanner.next();
            monthNum = checkMonth(month);
        } while (monthNum == -1);

        // Print the result
        System.out.println(Integer.parseInt(months[4][monthNum]) +
                ((checkLeapYear(year) && monthNum == 1) ? 1 : 0));
    }
}
