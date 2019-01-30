/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_removeelement;

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
        int[] nums = {0,1,2,2,3,0,4,2};
        int x = check.removeElement(nums, 2);
        System.out.println("elements after removal array is " +x);
    }
    public int removeElement(int[] nums, int val) {
       int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; 
    }
    
}
