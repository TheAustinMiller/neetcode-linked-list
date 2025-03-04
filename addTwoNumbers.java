public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder mes1 = new StringBuilder();
        ListNode current = l1;
        while (current != null) {
            mes1.append(current.val);
            current = current.next;
        }
        StringBuilder mes2 = new StringBuilder();
        current = l2;
        while (current != null) {
            mes2.append(current.val);
            current = current.next;
        }

        int a = Integer.parseInt(mes1.toString());
        int b = Integer.parseInt(mes2.toString());
        int sum = a + b;
        String chop = Integer.toString(sum);
        ListNode result = null;
        ListNode currentResult = null;
        for (int i = chop.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(chop.charAt(i));
            if (result == null) {
                result = new ListNode(digit);
                currentResult = result;
            } else {
                currentResult.next = new ListNode(digit);
                currentResult = currentResult.next;
            }
        }
        return result;
    }
