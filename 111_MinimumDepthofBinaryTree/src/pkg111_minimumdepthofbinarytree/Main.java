/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111_minimumdepthofbinarytree;

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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else if (root.left == null && root.right == null){
            return 1;
        }
        else if (root.left == null && root.right != null){
            int y = minDepth(root.right);
            return y+1;
        }
        else if (root.left != null && root.right != null){
            int x = minDepth(root.left);
            return x+1;
        }
        else{
            int x = minDepth(root.left);
            int y = minDepth(root.right);
            if(x <= y)
                return x+1;
            else
                return y+1;
        }  
    }
    
}
