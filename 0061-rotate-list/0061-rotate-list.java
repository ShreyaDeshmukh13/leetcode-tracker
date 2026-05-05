class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }

        // Step 2: make it circular
        temp.next = head;

        // Step 3: reduce k
        k = k % n;

        // Step 4: find new tail (n - k - 1 steps)
        int steps = n - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 5: set new head
        ListNode newHead = newTail.next;

        // Step 6: break the circle
        newTail.next = null;

        return newHead;
    }
}