/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171_excelsheetcolumnnumber;

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
        String s = "ZY";
        int x = check.titleToNumber(s);
        System.out.println(x);
    }
    public int titleToNumber(String s) {
        int sum = 0;
        int count26 = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char lastChar = s.charAt(i);
            int asciicode = lastChar - 'A';
            asciicode++;
            sum = sum + asciicode * count26;
            count26 = count26 * 26;
        }
        return sum;
    }
    
}
