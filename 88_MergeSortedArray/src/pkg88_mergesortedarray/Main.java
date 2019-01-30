/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg88_mergesortedarray;

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
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] >= nums2[j]){
                    for (int k = i; k < nums1.length; k++) {
                        nums1[i+1] = nums1[i];
                        nums1[i] = nums2[j];
                        
                    }
                }
                else{
                    for (int l = i; l < nums1.length; l++) {
                        if(nums1[i+1] < nums2[j]){
                         nums1[i+1] = nums1[i];
                         nums1[i] = nums2[j];
                        }
                        
                    }
                }
                    
                    
                
            }
            
            
        }
    }
    
}
