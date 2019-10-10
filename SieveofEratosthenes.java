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
        for ( i = 1; i < arraylength; i++)
        {
            arr[i] = i + 1;
        }
        int temp = arr[0];
        // implement the algorithm
        for(i = 1; i < arraylength; i++)
        {
            temp = arr[i];
            if (temp == 0)
                continue;
                   
            for(j = i + 1; j < arraylength; j++)
            {
                if (arr[j] == 0)
                    continue;
                if (arr[j] % temp == 0) 
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
