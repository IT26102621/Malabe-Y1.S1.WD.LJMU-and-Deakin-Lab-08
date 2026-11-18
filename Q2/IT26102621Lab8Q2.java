public class IT26102621Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Calculate A + B and store in C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Display A
        System.out.println("A Array Contents:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        // Display B
        System.out.println("\n\nB Array Contents:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        // Display C
        System.out.println("\n\nC Array Contents (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}