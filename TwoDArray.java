public class TwoDArray {
    public static void main(String[] args) {

        // Declaration and creation
        int[][] matrix = new int[3][4];

        // Initialization
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Accessing elements
        System.out.println("Element at [0][0] = " + matrix2[0][0]);

        // Displaying all elements
        System.out.println("2D Array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
