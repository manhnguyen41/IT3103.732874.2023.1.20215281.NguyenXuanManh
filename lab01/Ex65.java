package lab01;

// Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.

import java.util.Arrays;

public class Ex65 {
    public static void main(String[] args) {
        // Generate the example array
        double []arr = new double[]{1789, 2035, 1899, 1456, 2013};

        // Calculate the sum of the array
        double sum = 0;
        for (double number: arr) {
            sum += number;
        }

        // Calculate the average of the array
        double average = sum / arr.length;

        // Print the result
        Arrays.sort(arr);
        System.out.print("Array after sort: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Sum: ");
        System.out.println(sum);

        System.out.print("Average: ");
        System.out.println(average);
    }
}
