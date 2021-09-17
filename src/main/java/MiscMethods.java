import edu.princeton.cs.algs4.StdOut;

/**
 * This class contains a number of methods which can be useful in problem solving
 */
public class MiscMethods {
    public double Fibonacci(int n) {
        double[] values = new double[n + 2];
        if (n < 0) throw new IllegalArgumentException("Can not accept negative values");
        values[0] = 0;
        values[1] = 1;
        int i = 2;
        while (i <= n) {
            values[i] = values[i - 1] + values[i - 2];
            i++;
        }
        return values[n];
    }

    public double maimumInArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public double averageValueOfArray(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = sum / a.length;
        return average;
    }

    public double[] copyArray(double[] source) {
        double[] destination = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }

    public double[] reverseArrayElements(double[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - i - 1];
            a[N - i - 1] = temp;
        }
        return a;
    }

    /*  matrix matrix multiplication */
    public double[][] matrixMult(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; i < N; j++) {
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        return c;
    }

    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i < x; i++)
            if (x % i == 0) return false;
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // Harmonic number
    public static double H(int N) {
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += 1.0 / i;
        return sum;
    }

    //todo -- write some tests for this one make sure it works
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++)
            if (s.charAt(i) == s.charAt(N - 1 - i)) return false;
        return true;
    }

    public boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MiscMethods m = new MiscMethods();
        for (int N = 0; N < 100; N++) {
            System.out.println(N + ": " + m.Fibonacci(N));
        }
        StdOut.println("Have added princeton library ");
    }
}
