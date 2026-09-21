public class Demo {
      static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int square = square(number);

        System.out.println("Square = " + square);
    }
}
