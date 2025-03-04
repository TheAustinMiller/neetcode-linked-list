public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
