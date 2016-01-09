/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * Build time on my system: 1 second
 * Potential for higher efficiency
 * 
 * @author thejocin1
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int iteration = 1;
        int limit = 10001;
        int number = 2;
        
        while (iteration <= limit)
        {
            int checkPrime = 2;
            boolean isPrime = true;
            
            while (checkPrime <= number / 2 && isPrime == true)
            {
                if (number % checkPrime == 0)
                {
                   isPrime = false;
                }
                checkPrime++;
            }
            
            if (isPrime == true)
            {
                iteration++;
            }
            
            number++;
        }
        
        System.out.println("The " + (iteration - 1) + "th prime number is " + (number - 1));
    }
    
}
