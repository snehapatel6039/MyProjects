/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg202_happynumber;

import java.util.HashSet;

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
        int a = 19;
        boolean x = check.isHappy(a);
        System.out.println(" the number is happy " +x);
    }
    
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<Integer>();
        return isHappy(n, h);
    }
    
    private boolean isHappy(int n, HashSet<Integer> h) {
        int result = squareOfNumber(n);
        if(h.contains(result)){
            return false;
        }
        else if(result == 1){
            return true;
        }
        h.add(result);
        return isHappy(result, h);
    }
    
    private int squareOfNumber(int n){
       int result = 0;
        while(n > 0){
            int x = n % 10;
            result = result + (x * x);
            n = n / 10;
        }
        return result; 
    }
    
}
