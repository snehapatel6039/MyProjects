/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg122_besttimetobuyandsellstockii;

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
        int a[] = {7,1,5,3,6,4};
        int x = check.maxProfit(a);
        System.out.println("the maximum profit is " +x);
    }
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int currentprofit = 0;
        int min = prices[0];
        int totalprofit = 0;
        for (int i = 1; i < prices.length; i++) {
           if(prices[i] < min){
               min = prices[i];
           }
           else{
               currentprofit = prices[i] - min;
               totalprofit = totalprofit + currentprofit;
               min = prices[i];
                
            }
        }
        return totalprofit;
    }
    
}
