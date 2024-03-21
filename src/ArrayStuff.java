import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 100;
        int[] dataPoints = new int[SIZE];
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(101);
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate the sum and average of the values
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        // Linear scan for user input value
        int userValue = SafeInput.getRangedInt(in,"Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.printf("The user's value %d was found %d times in the array.%n", userValue, count);

        // Linear search for user input value position
        int userPosition = -1;
        int userValue2 = SafeInput.getRangedInt(in,"Enter another integer between 1 and 100: ", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                userPosition = i;
                break;
            }
        }
        if (userPosition != -1) {
            System.out.printf("The value %d was found at array index %d.%n", userValue2, userPosition);
        } else {
            System.out.printf("The value %d was not found in the array.%n", userValue2);
        }

        // Find minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        System.out.printf("The minimum value in the array is: %d%n", min);
        System.out.printf("The maximum value in the array is: %d%n", max);


    }
}