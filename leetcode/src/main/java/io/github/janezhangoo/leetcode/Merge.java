package io.github.janezhangoo.leetcode;

public class Merge {

    public static void main(String[] args){
//        mergeTwoLists(new ListNode(1, new ListNode(4)), null);
        reverseList(new ListNode(1, new ListNode(4)));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        while(head!=null){

        }
        return newHead;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode currentSmaller;
        ListNode current = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                currentSmaller = list1;
                list1 = list1.next;
            } else{
                currentSmaller = list2;
                list2 = list2.next;
            }
            current.next = currentSmaller;
            current = current.next;
        }
        if(list1 != null){
            if(current == null || head == null){
                head = list1;
            }else{
                current.next = list1;
            }
        }

        if(list2 != null){
            if(current == null || head == null){
                head = list2;
            }else{
                current.next = list2;
            }
        }

        return head.next;
    }

}
