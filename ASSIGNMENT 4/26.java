class Matrix {
    int[][] matrix1 = new int[2][2];
    int[][] matrix2 = new int[2][2];

    static String matrixType = "2x2 Matrix";

    void calculate() {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        m.matrix1 = a;
        m.matrix2 = b;

        m.calculate();
    }
}