/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136_singlenumber;

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
        int a[] = {10,20,36,78,81,10,36,20,78};
        int x = check.singleNumber(a);
        System.out.println("Unique distinct number is  " +x);
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];    
        }
        return result;
        
    }
    
}
