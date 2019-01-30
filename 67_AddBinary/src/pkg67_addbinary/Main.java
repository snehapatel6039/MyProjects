/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg67_addbinary;

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
        String a = "1010";
        String b  = "1011";
        String x = check.addBinary(a,b);
        System.out.println("Sum of two binary string is " +x);
    }
    public String addBinary(String a, String b) {
        int carry = 0;
        String output = "";
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 ; i--,j--) 
        {
            int a1 = (i < 0)? 0 : a.charAt(i) - '0';
            int b1 = (j < 0)? 0 : b.charAt(j) - '0';
            int sum  = a1 + b1 + carry;
            if (sum == 0) {
                carry = 0;    
                output = output + '0';
            }
            else if (sum == 1){
                carry = 0;
                output = output + '1';
            }
            else if (sum == 2){
                carry = 1;    
                output = output + '0';
            }
            else {
                carry = 1;    
                output = output + '1';
            }
        }
        
        if(carry != 0) output += '1';
        
        return Reverse(output);
    }
    
    private String Reverse(String input)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--)
        {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
