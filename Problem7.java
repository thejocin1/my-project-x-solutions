/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * @author Thejocin1
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
            int isPrime = 1;
            
            while (checkPrime <= number / 2)
            {
                if (number % checkPrime == 0)
                {
                   isPrime = 0;
                }
                checkPrime++;
            }
            
            if (isPrime == 1)
            {
                iteration++;
            }
            
            number++;
        }
        System.out.println("The " + (iteration - 1) + "th prime number is " + (number - 1));
    }
    
}
