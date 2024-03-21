public class Main {
    public static void main(String[] args) {
        int[] dataPoints = {5, 7, 3, 8, 4};
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}