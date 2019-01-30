/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg104_maximumdepthofbinarytree;

    
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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int x = maxDepth(root.left);
            int y = maxDepth(root.right);
            if(x >= y)
                return x+1;
            else
                return y+1;
        }  
    }
    
    
}
