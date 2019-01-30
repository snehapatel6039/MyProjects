/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_mergetwosortedlists;

/**
 *
 * @author sunny
 */

public class Main 
{

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode head = null, l3 = null;
        while (l1 != null && l2 != null) 
        {            
            if(l1.val < l2.val)
            {
                if(l3 == null)
                {
                    l3 = l1;
                    head = l3;
                }
                else
                {
                    l3.next = l1;
                    l3 = l3.next;
                }
                l1 = l1.next;
            }
            else
            {
                if(l3 == null)
                {
                    l3 = l2;
                    head = l3;
                }
                else
                {
                    l3.next = l2;
                    l3 = l3.next;
                }
                l2 = l2.next;
            }
        }
        
        if(l1 == null)
        {
            l3.next = l2;
        }
        else
        {
            l3.next = l1;
        }
        return head;
    }
    
        
   
    
}
