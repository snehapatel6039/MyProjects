/*
 * Solved the problem described here: http://www.spoj.com/problems/FCTRL/
 */
package zerosinfactorial;

import java.util.Scanner;

/**
 * @author Sneha Patel
 */
public class ZerosInFactorial {

    public static void main(String[] args) {
        
        try (Scanner reader = new Scanner(System.in)) {
            int numberoftests = Integer.parseInt(reader.nextLine());
            for(int i = 0; i < numberoftests; i++) {
                int findZerosForNum = Integer.parseInt(reader.nextLine());
                int countOfZeros = 0;
                for(int j = 5; j <= findZerosForNum; j*=5) {
                    countOfZeros += Math.floor(findZerosForNum / j);
                }
                System.out.println(countOfZeros);
            }
        }
        catch(NumberFormatException nfe)
        {
            System.err.println(nfe);
        }
    }
}
