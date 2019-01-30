/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28_implementstrstr;

import javax.accessibility.AccessibleText;

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
        Main check = new Main();
        String haystack = "helllo";
        String needle  = "llo";
        int x = check.strStr(haystack, needle);
        System.out.println("the first occurrence of needle in haystack " +x);
    }
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length(); i++) 
        {
            boolean found = true;
            int x = i;
            for (int j = 0; j < needle.length(); j++) 
            {
                if(x >= haystack.length()) 
                {
                    return -1;
                }
                else if(haystack.charAt(x) == needle.charAt(j))
                {
                    x++;
                }
                else
                {
                    found = false;
                    break;
                }    
            }
            if(found)
            {
                return i;
            }
        }
        return -1;
    }
}
