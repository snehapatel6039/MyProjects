/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author sunny
 */
public class BinaryTree {

    int root;
    BinaryTree left;
    BinaryTree right;
   
    public static void main(String[] args) {
        BinaryTree Tree = new BinaryTree(20);
        int[] num = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        for(int i : num ) {
            Tree.addNode(i);
        }
        System.out.println("Traverse Preorder Tree");
        Tree.TraversePreorder();
        System.out.println();
        System.out.println("Traverse Postorder Tree");
        Tree.TraversePostorder();
        System.out.println();
        System.out.println("Traverse Inorder Tree");
        Tree.TraverseInorder();
        System.out.println();
    }    
    public BinaryTree(int num){
        root = num;
        left = null;
        right = null;
    }
    public void addNode(int num){
        if(num < root){
            if(left != null){
                left.addNode(num);
            }
            else{
                left = new BinaryTree(num);
            }
            
        }
        else{
            if(right != null){
                right.addNode(num);
            }
            else{
                right = new BinaryTree(num);
            }
            
        }
    }
    public void TraversePreorder(){
        System.out.print(root +",");
        if(left != null){
            left.TraversePreorder();
        }
        if(right != null){
            right.TraversePreorder();
        }
    }
    public void TraversePostorder(){
        if(left != null){
            left.TraversePreorder();
        }
        if(right != null){
            right.TraversePostorder();
        }
         System.out.print(root +",");
    }
    public void TraverseInorder(){
        if(left != null){
            left.TraversePreorder();
        }
         System.out.print(root +",");
        if(right != null){
            right.TraverseInorder();
        }
        
    }
   
    
}   

    
    

