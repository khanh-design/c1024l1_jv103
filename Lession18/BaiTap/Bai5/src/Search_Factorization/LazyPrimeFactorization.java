package Search_Factorization;

public class LazyPrimeFactorization implements Runnable{
    private int num;
    @Override
    public void run() {
        if(num < 2){
            System.out.println(num + " is not prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}
