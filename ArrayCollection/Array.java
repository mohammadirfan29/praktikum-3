package ArrayCollection;

public class Array {
    public static void main(String[] args) {
        // Array 1 dimensi
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Elemen pertama: " + numbers[0]);

        // Array 2 dimensi
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Elemen [1][2]: " + matrix[1][2]); // output 6
    }
}
