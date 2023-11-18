public class GenapGanjilPrimaFibonacci {
    public static void main(String[] args) {
        System.out.println("Bilangan Genap, Ganjil, Prima, dan Fibonacci antara 1 sampai 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }

            if (isPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            }

            if (isFibonacci(i)) {
                System.out.println(i + " adalah bilangan Fibonacci");
            }
        }
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan prima
    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah bilangan Fibonacci
    private static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }
}
