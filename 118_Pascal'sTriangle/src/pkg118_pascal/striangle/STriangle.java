/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg118_pascal.striangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunny
 */
public class STriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows==0){
            return triangle;
        }
        
        List<Integer> line1 = new ArrayList<Integer>();
        line1.add(1);
        triangle.add(line1);
        if(numRows==1){
            return triangle;
        }
        for(int lineNum = 2;lineNum <= numRows; lineNum++){
            List<Integer> last = triangle.get(lineNum - 2);
            List<Integer> current  = new ArrayList<Integer>();
            current.add(1);
            for(int i=0; i< last.size()-1 ;i++){
                current.add(last.get(i) + last.get(i + 1));
            }
            current.add(1);
            triangle.add(current);
        }
        return triangle;
    }
    
}
