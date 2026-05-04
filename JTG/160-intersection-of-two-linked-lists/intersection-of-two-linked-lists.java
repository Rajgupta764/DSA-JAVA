/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode temp1=headA;
        ListNode temp2=headB;
        int size1=0;
        int size2=0;
        while(temp1.next!=null){
              size1++;
              temp1=temp1.next;
        }
        while(temp2.next!=null){
            size2++;
            temp2=temp2.next;
        }

        temp1=headA;
        temp2=headB;
       if(size1>size2){
        int d=size1-size2;
        for(int i=0;i<d;i++){
            temp1=temp1.next;
        }
       }
       else if(size1<size2){
        int d=size2-size1;
        for(int i=0;i<d;i++){
            temp2=temp2.next;
        }
       }
       while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;
       }
       return temp1;

    }
}