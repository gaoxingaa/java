package io.github.janezhangoo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int pivotIndex(int[] nums) {
        int pivot = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int length = nums.length;
        int sum = 0;
        for(pivot = 0; pivot < length;pivot++){
            sum += nums[pivot];
        }
        for(pivot = 0; pivot < length;pivot++){
            sumLeft += pivot >= 1 ? nums[pivot-1]:0;
            sumRight = sum - sumLeft - nums[pivot];
            if(sumLeft == sumRight){
                return pivot;
            }


        }
        return -1;
    }

    public static void main( String[] args )
    {
//        pivotIndex(new int[]{1,7,3,6,5,6});
//        a("paper","title");
        reverseList(new ListNode(1, new ListNode(2, new ListNode(3, null))));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapped = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (mapped.get(s.charAt(i)) == null) {
                    if (mapped.containsValue(t.charAt(i))) {
                        return false;
                    } else {
                        mapped.put(s.charAt(i), t.charAt(i));
                    }
                } else if (mapped.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean a(String s, String t) {
        int[] s_map = new int[256];
        int[] t_map = new int[256];

        for(int i=0; i<s.length(); i++) {
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);

            if(s_map[s_char] != t_map[t_char]) {
                return false;
            }
            s_map[s_char] = i + 1;
            t_map[t_char] = i + 1;
        }
        return true;

    }

    public boolean isSubsequence(String s, String t) {
        for(int i = 0,j=0; i < s.length(); i++){

            j = t.indexOf(s.charAt(i), j);

            if(j < 0){
                return false;
            }

        }
        return true;
    }

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode oldHead = new ListNode(head.val, null);
        ListNode newHead = null;
        while(head.next != null){
            newHead = new ListNode(head.next.val, null);
            newHead.next = oldHead;
            oldHead = newHead;

            head = head.next;


        }
        return newHead;
    }

    public static ListNode detectCycle(ListNode head) {
        Set<Integer> nodes = new HashSet<Integer>();
        while(head != null && head.next != null){
            nodes.add(head.val);
            if(nodes.contains(head.next.val)){
                return head.next;
            }
            head = head.next;
        }
        return null;
    }

}
