package Search_Factorization;

public class TestFactorizationThread {
    public static void main(String[] args) {
        LazyPrimeFactorization primeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        primeFactorization.run();
        optimizedPrimeFactorization.run();
    }
}
