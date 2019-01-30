/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg172_factorialtrailingzeroes;

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
        int a = 1808548329;
        int x = check.trailingZeroes(a);
        System.out.println("The number of trailing zeroes are " +x);
    }
    public int trailingZeroes(int n) {
        int count = 0;
        long z = 5;
        while(z < n){
            int y = n / (int) z;
            count = count + y;
            z = z * 5;
        }
        return count;
    }
    
}
