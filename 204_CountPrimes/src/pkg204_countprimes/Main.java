/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg204_countprimes;

/**
 *
 * @author sunny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main check = new Main();
        int s = 10;
        int x = check.countPrimes(s);
        System.out.println(x);
    }
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0 ||i % 3 != 0 || i % 5 != 0 || i % 7 != 0) {
                count++;
            }
              
        }
        return count;
    }
    
}
