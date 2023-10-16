package lab01;

import java.util.Scanner;

public class DayOfMonth {
    // Check if year is valid
    public static String [][]months = new String[5][12];
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
            months[2][i] = months[0][i].substring(0, 3);
            months[1][i] = months[2][i] + (i == 8 ? "t" : "") + ".";
            months[3][i] = Integer.toString(i + 1);
        }

        do {
            System.out.print("Year: ");
            year = scanner.next();
        } while (!checkYear(year));

        do {
            System.out.print("Month: ");
            month = scanner.next();
            monthNum = checkMonth(month);
        } while (monthNum == -1);

        System.out.println(Integer.parseInt(months[4][monthNum]) +
                ((checkLeapYear(year) && monthNum == 1) ? 1 : 0));
    }
}
