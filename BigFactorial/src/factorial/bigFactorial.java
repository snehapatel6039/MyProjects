/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author sunny
 */

import java.math.BigInteger;
import java.util.Scanner;
public class bigFactorial {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number whose count of zeros is to be found at the end of factorial");
    int x = s.nextInt();
    int countOfZeros = 0;
    for(int i = 5; i <= x; i=i*5)
    {
        countOfZeros += (int) Math.floor(x / i);
    }
    System.out.println(countOfZeros);
    //String fact = factorial(125);
    //System.out.println(fact);
}

public static String factorial(int n) {
BigInteger fact = new BigInteger("1");
for (int i = 1; i <= n; i++) {
fact = fact.multiply(new BigInteger(Integer.toString(i)));
}
return fact.toString();
}
}

    

    /**
     * @param args the command line arguments
     */
    
    


