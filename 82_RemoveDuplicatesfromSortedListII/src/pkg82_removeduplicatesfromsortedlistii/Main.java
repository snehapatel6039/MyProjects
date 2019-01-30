/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg82_removeduplicatesfromsortedlistii;

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
    
    private ListNode GetNextEleAfterCurrentDups(ListNode start)
    {
        int valToRemove = start.val;
        while (start.next != null && start.next.val == valToRemove) 
        {            
            start = start.next;
        }
        return start.next;
    }
    
    public ListNode deleteDuplicates(ListNode head) 
    {
         if(head == null){
             return head;
         }
         
         ListNode first = head;
         while (first != null && first.next != null && first.val == first.next.val) 
         {
            ListNode next = GetNextEleAfterCurrentDups(first);
            first = next;
         }

         head = first;
         if(head == null) return null;
         
         ListNode second = first.next;
         while(second != null)
         {
            while (second != null && second.next != null && second.val == second.next.val) 
            {
               ListNode next = GetNextEleAfterCurrentDups(second);
               second = next;
            }
            
            first.next = second;
            if(second != null)
            {
                second = second.next;
            }
         }         
         return head;
    }
    
    
    
}
