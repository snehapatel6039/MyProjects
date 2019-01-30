/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg66_plusone;

/**
 *
 * @author sunny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main check = new Main();
        int[] nums = {1,8,2,0,9,9,9,9,9,9,9};
        int[] x = check.plusOne(nums);
        for (int z = 0; z < x.length; z++) {
            System.out.print(x[z]+" ");
        }
    }
    public int[] plusOne(int[] digits) {
        boolean x = IsAllDigits9(digits);
        if(x)
        {
            int[] digitsCopyOfAll9 = new int[digits.length+1];
            digitsCopyOfAll9[0] = 1;
            return digitsCopyOfAll9;
        }
        else
        {
            for (int i = digits.length-1; i >= 0; i--) {
                if(digits[i] == 9){
                    digits[i] = 0;
                }
                else{
                    digits[i]++;
                    return digits;
                }
            }
        }    
        return digits;
    }

    private boolean IsAllDigits9(int[] array)
    {
        for (int j = 0; j < array.length; j++) {
            if(array[j] != 9){
               return false;
            }
        }
        return true;
    }
}    
    

