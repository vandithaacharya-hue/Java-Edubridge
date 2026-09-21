import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
