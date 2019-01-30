/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_palindromenumber;

/**
 *
 * @author sunny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Main rev = new Main();
        boolean b = rev.isPalindrome(12300);
        System.out.println(" reverse of the number is "  + b);
        
    }
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int y = revrev(x);
        return x == y;
        
    }
    
    private int revrev(int x) {
        {
            int r = 0;
            while(x!=0)
            {    
            r = r*10 + x % 10;
            x = x / 10;
            }
            return r;
       
        }
    
    }
}