/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 * Build time on my system: 0 seconds
 * Satisfied with efficiency
 * 
 * @author Thejocin1
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int firstFibonacci = 1;
        int secondFibonacci = 2;
        int currentFibonacci = 2;
        int limit = 4000000;
        int sum = 0;
        
        while (currentFibonacci < limit)
        {
            if (currentFibonacci % 2 == 0)
            {
                sum = sum + currentFibonacci;
            }
            
            currentFibonacci = firstFibonacci + secondFibonacci;
            firstFibonacci = secondFibonacci;
            secondFibonacci = currentFibonacci;
        }
        
        System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed "
            + limit + " ,the sum of the even-valued terms is " + sum);
    }
}
