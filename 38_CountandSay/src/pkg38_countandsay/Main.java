/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38_countandsay;

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
        Main valid = new Main();
        String s = valid.countAndSay(85);
        System.out.println("the string of count and say is " + s);
    }
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String x = "1";
        String y = "";
        for (int i = 2; i <= n; i++) {
            char temp = '\0';
            int count = 0;
            for (int j = 0; j < x.length(); j++) {
                if(count == 0){
                    temp = x.charAt(j);
                    count++;
                }
                else{
                    if(x.charAt(j) == temp){
                        count++;
                    }
                    else{
                        y += Integer.toString(count) + temp;
                        temp = x.charAt(j);
                        count = 1;                        
                    }
                }
            }
            y += Integer.toString(count) + temp;
            x = y;
            y = "";
        }
        return x;
    }
}

