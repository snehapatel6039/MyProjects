/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_reverseinteger;

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
        int x = rev.reverse(12300);
        System.out.println(" reverse of the number is "  + x);
        
    }
    public int reverse(int x) {
        int w = trimzero(x);
        int y = revrev(w);
        int z = revrev(y);
        if(z == w)
        {
            return y;
        }
        else
        {
            return 0;
        }
    }
    
    private int revrev(int x) {
        int r = 0;
        while(x!=0)
        {    
            r = r*10 + x % 10;
            x = x / 10;
        }
         return r;
    }
    private int trimzero(int x) {
        while(x % 10 == 0)
        {
            x = x/10;
        }    
         return x;
    }
}
