
import static java.lang.Math.sqrt;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * Build time on my system: 3 seconds
 * Potential for higher efficiency
 * 
 * @author thejocin1
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int limit = 2_000_000;
        long sum = 0;
        
        for (int number = 2; number <= limit; number++)
        {
            int checkPrime = 2;
            boolean isPrime = true;
            
            while (checkPrime <= sqrt(number) && isPrime == true)
            {
                if (number % checkPrime == 0)
                {
                    isPrime = false;
                }
                
                checkPrime++;
            }
            
            if (isPrime == true)
            {
                sum = sum + number;
                System.out.println(+ number);
            }
        }
        
        System.out.println("The sum of all the primes below " + limit + " is " + sum);
    }
    
}
