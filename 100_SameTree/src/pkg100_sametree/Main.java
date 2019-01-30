/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_sametree;

/**
 *
 * @author sunny
 */
public class Main {

    /*Definition for a binary tree node.*/
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        Main check = new Main();
        
        boolean x = check.isSameTree(a, b);
        System.out.println("the result for the same tree is " +x); 
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        else if(p.val != q.val){
            return false;
        }
        
        // We reach here means both node has same value
        //boolean y = isSameTree(p.left, q.left);
        //if(y == false) return false;
        
        //boolean z = isSameTree(p.right, q.right);
        //return z;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
}
