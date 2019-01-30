/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg53_maximumsubarray;

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
        int[] nums = {1,2,-1,-2,2,1,-2,1,4,-5,4};
        int x = check.maxSubArray(nums);
        System.out.println("largest sum of the elements of the array is " +x);
    }
    public int maxSubArray(int[] nums) {
        int[] numsCopy = new int[nums.length];
        numsCopy[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int previous = numsCopy[i-1];
            if(previous <= 0){
                numsCopy[i] = current;
            }
            else if(previous > 0){
                int add = nums[i] + numsCopy[i-1];
                numsCopy[i] = add;
            }
        }
        return FindMaximumInArray(numsCopy);
    }
    
    private int FindMaximumInArray(int[] array)
    {
        int maxvalue = array[0];
        for (int j = 0; j < array.length; j++) {
            if(maxvalue < array[j]){
                maxvalue = array[j];
            }
        }
        return maxvalue;
    }
}
