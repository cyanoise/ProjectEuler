package ProjectEuler;

public class Problem_009 {

    public static void main(String[] args) {
        double start = System.nanoTime();

        System.out.println(pythagoreanTriplet(1000));

        System.out.println((System.nanoTime() - start) / 1_000_000 + " ms");
    }

    private static long pythagoreanTriplet(int limit) {
        for (int a = 1; a < limit; a++) {
            for (int b = a + 1; b < limit; b++) {
                double c = Math.ceil(Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0)));
                if (Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0) && a + b + c == 1000.0) {
                    return (long) (a * b * c);
                }
            }
        }
        return 0;
    }
}
