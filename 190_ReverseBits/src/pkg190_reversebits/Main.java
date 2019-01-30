/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg190_reversebits;



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
        long x = check.reverseBits(s);
        System.out.println(x);
    }
   
    public int reverseBits(int n) {
        String reverseString = "";
        String binString = Integer.toBinaryString(n);
        for (int i = binString.length() - 1; i >= 0; i--) {
            char c = binString.charAt(i);
            reverseString = reverseString + c;
        }
        System.out.println(binString);
        System.out.println(reverseString);
        return Integer.parseInt(reverseString,2);
    }
    
}
