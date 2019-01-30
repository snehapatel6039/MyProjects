/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_romantointeger;

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
        Main roman = new Main();
        int x = roman.romanToInt("III");
        System.out.println(" Roman to Integer of the number is "  + x);
    }
    
    private int GetIntegerValueFromChar(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M' : return 1000;
            default : return 0;

        }
    }
    
    
    public int romanToInt(String s) {
        int j  = 0;
        int LENGTH = s.length();
        for (int i = 0; i < LENGTH; i++) {
            char firstchar = s.charAt(i);
            char nextchar = 'S';
            if(i+1 != LENGTH)
            {
                nextchar = s.charAt(i+1);
            }    
            int fc = GetIntegerValueFromChar(firstchar);
            int nc = GetIntegerValueFromChar(nextchar);
            if(nc > fc)
            {
                j = j + (nc - fc);
                i++;
            } 
            else
            {
                j = j + fc;
            }
        }
        return j;   
    }
    
}
