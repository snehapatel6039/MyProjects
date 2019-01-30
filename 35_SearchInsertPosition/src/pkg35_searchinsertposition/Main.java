/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_searchinsertposition;

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
        int[] nums = {0,1,2,3,5,6};
        int x = check.searchInsert(nums, 5);
        System.out.println("elements of search insert funstion is " +x);
    }
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {            
            int mid = (low + high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                if(mid + 1 == nums.length)
                {
                    return nums.length;
                }
                else if(nums[mid + 1] > target)
                {
                    return mid + 1;
                }
                low = mid + 1;
            }
            else //if(nums[mid] > target)
            {
                if(mid == 0)
                {
                    return 0;
                }
                else if(nums[mid - 1] < target)
                {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return 0;
    }
    
}
 