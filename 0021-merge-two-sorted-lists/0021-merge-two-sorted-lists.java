import java.util.*;

class Solution {

    public ListNode createList(List<Integer> arr) {
        if (arr == null || arr.size() == 0) return null;

        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;

        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr = new ArrayList<>();

        while (list1 != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }

        if (arr.size() == 0) return null;

        Collections.sort(arr);

        return createList(arr);
    }
}