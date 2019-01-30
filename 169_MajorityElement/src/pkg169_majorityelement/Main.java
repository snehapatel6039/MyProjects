/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg169_majorityelement;

import java.util.HashMap;
import java.util.Map;

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
        int[] s = {2,2,1,1,1,2,2};
        int x = check.majorityElement(s);
        System.out.println(x);
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }
            else{
                hmap.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value.intValue() > nums.length / 2){
                return key.intValue();
            }
        }
        return 0;
    }
}
