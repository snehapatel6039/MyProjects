/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_twosum;



/**
 *
 * @author sunny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = m.twoSum(nums, target);
        System.out.println(ans[0] + " - " + ans[1]);
    }
    
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length-1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(target == (nums[i] + nums[j]))
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
