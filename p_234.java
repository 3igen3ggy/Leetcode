import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int len = list.size();
        for (int i = 0; i < len / 2; i++) {
            if (list.get(i) != list.get(len - i - 1)) return false;
        }
        return true;
    }
}
