/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg121_besttimetobuyandsellstock;

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
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
           if(prices[i] < min){
               min = prices[i];
           }
           else{
               int cal = prices[i] - min;
               if(cal > profit){
                   profit = cal;
               }
            }
        }
        return profit;
    }
    
}
