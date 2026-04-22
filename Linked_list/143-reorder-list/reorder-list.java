class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the Middle (Right Middle)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the Second Half
        // slow yahan middle par hai, toh slow.next se reverse shuru karenge
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // Pehli list ko yahan cut kar diya

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // 3. Merge the two lists (Zig-Zag)
        ListNode first = head;      // List 1: 1 -> 2 -> 3
        ListNode second = prev;    // List 2: 5 -> 4 (Reversed)

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;     // 1 ko 5 se joda
            second.next = temp1;    // 5 ko 2 se joda

            first = temp1;           // pointers aage badhao
            second = temp2;
        }
    }
}