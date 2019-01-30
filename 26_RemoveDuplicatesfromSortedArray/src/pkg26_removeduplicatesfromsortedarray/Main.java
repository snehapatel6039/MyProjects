/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_removeduplicatesfromsortedarray;

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
        int[] nums = {1,1,1,2,2,3,5,6,8,8,9};
        int x = check.removeDuplicates(nums);
        System.out.println("the remove duplicates array is " +x);
        
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j])
            {
                i = i+1;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    
}
