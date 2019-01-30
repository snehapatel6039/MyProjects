/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg231_poweroftwo;

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
        int s = 129;
        boolean x = check.isPowerOfTwo(s);
        System.out.println(x);
    }
    public boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }
        while(n > 1){
            if(n % 2!= 0){
                return false;
            }
            else{
                n = n / 2;
            }
        }
        return true;
    }
    
}
