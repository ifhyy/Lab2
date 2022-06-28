class Main {
    public static void main(String[] args) {
        // c5 = 3 A XOR B
        // c7 = 4 long
        //c11 = 5 Обчислити суму найбільших елементів в рядках матриці з непарними номерами та найменших елементів
        // в рядках матриці з парними номерами
        long[][] A = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {3, 4, 1, 0},
                {6, 2, 8, 4}};
        long[][] B = {
                {3, 4, 5, 4},
                {6, 7, 8, 5},
                {2, 3, 5, 5},
                {2, 0, 8, 4}};

        long[][] C = new long[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] ^ B[i][j];
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        int s = 0;
        for (int j = 0; j < C.length; j += 2) {
            long max = C[j][0];
            for (int i = 1; i < C[0].length; i++) {
                if (C[j][i] > max) {
                    max = C[j][i];
                }
            }
            s += max;

        }

        int g = 0;
        for (int j = 1; j < C.length; j += 2) {
            long min = C[j][0];
            for (int i = 1; i < C[0].length; i++) {
                if (C[j][i] < min) {
                    min = C[j][i];
                }
            }
            g += min;

        }
        System.out.println("Sum s = " + (s + g));
    }
}