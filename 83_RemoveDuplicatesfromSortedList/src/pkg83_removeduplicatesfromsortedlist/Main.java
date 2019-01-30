/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg83_removeduplicatesfromsortedlist;

/**
 *
 * @author sunny
 */
public class Main {

    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        Main check = new Main();
        int a = 10;
        int x = check.deleteDuplicates(a);
        System.out.println("the sorted arrey after delete duplicates is " +x); 
    }
    public ListNode deleteDuplicates(ListNode head) {
         if(head == null){
             return head;
         }
         ListNode first = head;
         ListNode second  = head.next;
         while (second != null) {
            if(first.val == second.val){
                first.next = second.next;
                second = second.next;
            }
            else{
                second = second.next;
                first = first.next;
            }
         }
        return head;
    }
}
