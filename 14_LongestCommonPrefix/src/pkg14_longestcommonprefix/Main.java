/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_longestcommonprefix;

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
        Main prefix = new Main();
        String[] strs = {"flower", "flour", "flight","flow"};
        String x = prefix.longestCommonPrefix(strs);
        System.out.println(" longest common prefix is  "  +x );
        
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            return "";
        }
        String k = "";
        for (int i = 0; i < strs[0].length(); i++) 
        {
            char cc = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++)
            {
                if(strs[j].length() == i)
                {
                    return k;
                }    
                char ic = strs[j].charAt(i);
                if(cc != ic)
                {
                    return k;
                }
            }
            k = k + cc;
        }
        return k;
        
    }
    
}
