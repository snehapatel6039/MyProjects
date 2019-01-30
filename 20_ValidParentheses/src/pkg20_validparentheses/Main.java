/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_validparentheses;

import java.util.Stack;

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
        Boolean parentheses = valid.isValid("{([])}");
        System.out.println("the boolean value of parentheses is " + parentheses);
        
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) 
        {   
            char element = s.charAt(i);
            if(element == '{' || element == '[' || element =='(')
            {
                Character elementGeneric = element;
                st.push(elementGeneric);
            }
            else if(element == '}' | element == ']' | element ==')')
            {
                if(st.empty())
                {
                    return false;
                }    
                char elementPoped = st.pop().charValue();
                if(element == '}' && elementPoped == '{') continue;
                else if (element == ']' && elementPoped == '[') continue;
                else if (element == ')' && elementPoped == '(') continue;
                return false;
            }
        }
        return st.empty();       
        
    }
    
}
