/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg167_twosumiiinputarrayissorted;

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
        int a[] = {2,5,6,8,10};
        int x[] = check.twoSum(a, 11);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            
        }
        
    }
    public int[] twoSum(int[] numbers, int target) {
        int last = numbers.length - 1;
        int first = 0;
        while(first < last)
        {
            int sum = numbers[first] + numbers[last];
            if(sum == target){
                int[] num = {first+1 ,last+1};
                return num;
            }
            else if(sum < target){
                first++;
            }
            else{
                last--;
            }
        }
        return new int[0];
    }
    

}
