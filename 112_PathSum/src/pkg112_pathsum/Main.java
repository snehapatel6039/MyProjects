/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg112_pathsum;

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        
        if (root.left == null && root.right == null){
            return (root.val  == sum);
        }
        
        boolean left = (root.left == null) ? false : hasPathSum(root.left, sum - root.val);
        boolean right = (root.right == null) ? false : hasPathSum(root.right, sum - root.val);
        return (left || right);
    }
}    
        
        /*else if (root.left == null && root.right != null){
            int value = root.val;
            value = sum - value;
            boolean y = hasPathSum(root.right, value);
            return y;
        }    
        else if (root.left != null && root.right == null){
            int value = root.val;
            value = sum - value;
            boolean z = hasPathSum(root.left, value);
            return z;
        }    
        else if (root.left != null && root.right != null){
            int value = root.val;
            value = sum - value;
            boolean a = hasPathSum(root.left, value);
            boolean b = hasPathSum(root.right,value);
            if(a || b  == true){
                return true;
            }
             
        }    
        return false;*/
        
    