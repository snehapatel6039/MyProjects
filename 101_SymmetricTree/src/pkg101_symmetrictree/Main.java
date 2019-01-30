/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg101_symmetrictree;

/**
 *
 * @author sunny
 */
public class Main {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        else{
            boolean x = checkViceversaSame(root.left, root.right);
            return x;
        }
            
    }
    private boolean checkViceversaSame(TreeNode l,TreeNode r){
        if(l == null && r == null){
            return true;
        }
        else if(l == null || r == null){
            return false;
        }
        else if(l.val != r.val){
            return false;
        }
        return checkViceversaSame(l.left, r.right) && checkViceversaSame(l.right, r.left);
    }
    
}
