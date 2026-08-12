class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        // Put digits into stacks
        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int carry = 0;

        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {

            int x = st1.isEmpty() ? 0 : st1.pop();
            int y = st2.isEmpty() ? 0 : st2.pop();

            int sum = x + y + carry;

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);

            // Insert at front
            node.next = head;
            head = node;
        }

        return head;
    }
}