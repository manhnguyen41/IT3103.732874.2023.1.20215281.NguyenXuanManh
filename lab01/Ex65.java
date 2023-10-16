package lab01;

import java.util.Arrays;

public class Ex65 {
    public static void main(String[] args) {
        double []arr = new double[]{1789, 2035, 1899, 1456, 2013};

        double sum = 0;
        for (double number: arr) {
            sum += number;
        }

        double average = sum / arr.length;

        Arrays.sort(arr);
        System.out.print("Array after sort: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Sum: ");
        System.out.println(sum);

        System.out.print("Average: ");
        System.out.println(average);
    }
}
