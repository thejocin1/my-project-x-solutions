/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Build time on my system: Way too long for practicality
 * Potential for higher efficiency and readability
 * 
 * @author thejocin1
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean found = false;
        long number = 600_851_475_143L;
        long factor = number / 2;
        
        while (found == false)
        {
            if (number % factor == 0)
            {
                long checkPrime = 2;
                boolean isPrime = true;

                while (checkPrime <= factor / 2 && isPrime == true)
                {
                    if (factor % checkPrime == 0)
                    {
                       isPrime = false;
                    }
                    
                    checkPrime++;
                }

                if (isPrime == true)
                {
                    found = true;
                }
            }
            
            if (found == false)
            {
                factor--;     
            }
        }
        
        System.out.println("The largest prime factor of the number " + number + " is " + factor);
    }
    
}
