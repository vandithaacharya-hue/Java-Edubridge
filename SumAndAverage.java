public class SumAndAverage {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
