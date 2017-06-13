/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

/**
 *
 * @author sunny
 */
public class ATMMachine {

    private static int c1 = 0;
    private static int c5 = 0;
    private static int c10 = 0;
    private static int c20 = 0;
    private static int c50 = 0;
    private static int c100 = 0;
    private static int c500 = 0;
    private static int c1000 = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int money = Integer.parseInt(args[0]);
        System.out.println(money);
        
        while (money > 0) {
            money = money - GetOneNote(money);
        }
        
        System.out.println("1000 - "+c1000);
        System.out.println("500 - "+c500);
        System.out.println("100 - "+c100);
        System.out.println("50 - "+c50);
        System.out.println("20 - "+c20);
        System.out.println("10 - "+c10);
        System.out.println("5 - "+c5);
        System.out.println("1 - "+c1);
    }
    
    private static int GetOneNote(int m) {
        if(m >= 1000) {
            c1000++;
            return 1000;
        } else if(m >= 500) {
            c500++;
            return 500;
        } else if(m >= 100) {
            c100++;
            return 100;
        } else if(m >= 50) {
            c50++;
            return 50;
        } else if(m >= 20) {
            c20++;
            return 20;
        } else if(m >= 10) {
            c10++;
            return 10;
        } else if(m >= 5) {
            c5++;
            return 5;
        } else if(m >= 1) {
            c1++;
            return 1;
        }
        return 0;
    }
    
}
