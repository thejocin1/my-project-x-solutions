/*thejocin1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Build time on my system: 0 seconds
 * Satisfied with efficiency
 */

#include<stdio.h>

int main(){

    int limit = 1000;
    int number;
    int sum = 0;

    for (number = 1; number < limit; number++)
    {
        if (number % 3 == 0 || number % 5 == 0)
        {
            sum = sum + number;
        }
    }

    printf("The sum of all the multiples of 3 or 5 below %d is %d\n", limit, sum);

    return 0;
}
