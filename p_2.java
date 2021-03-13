class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode l3 = dummy;
		int carry = 0;
		
		while (l1 != null || l2 != null) {
			int l1_val = (l1 == null) ? 0 : l1.val;
			int l2_val = (l2 == null) ? 0 : l2.val;
			
			int sum = l1_val + l2_val + carry;
			int dig = sum % 10;
			carry = sum / 10;
			
			ListNode newNode = new ListNode(dig);
			l3.next = newNode;
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			l3 = l3.next;
		}
		
		if (carry > 0) {
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		
		return dummy.next;
	}
}
