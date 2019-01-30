/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg189_rotatearray;

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
        int a[] = {1,2,3,4,5,6,7};
        check.rotate(a, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
        
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    private void reverse(int[] nums, int i, int j){
        int temp;
        while(i < j)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    
}
