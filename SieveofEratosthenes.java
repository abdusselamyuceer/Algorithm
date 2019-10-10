/* implementation of Sieve of Eratosthenes algorithm.
Writer: Abdüsselam YÜCEER
Date: 10.10.2019
*/
package geekforgeekproblem;

import java.util.Scanner;

/**
 *
 * @author abdusselam.yuceer
 */
public class SieveofEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the array length");
        int arraylength = input.nextInt();
        
        int arr[] = new int[arraylength];
        int i, j;
        //fill the array
        for ( i = 0; i < arraylength; i++)
        {
            arr[i] = i;
        }
        int temp = arr[0];
        // implement the algorithm
        for(i = 2; i * i < arraylength; i++)
        {                       
            for(j = i * i; j < arraylength; j+=i)
            {
                arr[j] = 0;
            }
        }
        //write the array
        for ( i = 0; i < arraylength; i++)
        {
            if (arr[i] != 0) 
            System.out.print(arr[i] + " ");
        }

    }
    
}
