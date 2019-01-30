/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg191_numberof.pkg1bits;

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
        int a = 21;
        int x = check.hammingWeight(a);
        System.out.println(" the number of 1's in binary representation is  " +x);
    }
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
    
}
