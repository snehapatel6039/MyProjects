/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg70_climbingstairs;

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
        int a = 10;
        int x = check.climbStairs(a);
        System.out.println("Distinct ways to climb to the top " +x);
    }
    public int climbStairs(int s) {
        if (s <= 1)
        {
            return s;
        }
        
        else
        {
            int a = 1, b = 1;
            for (int i = 2; i <= s; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    
}
