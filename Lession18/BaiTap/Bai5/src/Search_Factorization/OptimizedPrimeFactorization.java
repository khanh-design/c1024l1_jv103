package Search_Factorization;

public class OptimizedPrimeFactorization implements Runnable {
    private int number;
    @Override
    public void run() {
        if (number < 2) {
            System.out.println(number + " is not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
