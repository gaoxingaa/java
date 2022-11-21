/**
 * © Copyright 2022 Micro Focus or one of its affiliates
 * The only warranties for products and services of Micro Focus and its affiliates and licensors (“Micro Focus”) are as
 * may be set forth in the express warranty statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Micro Focus shall not be liable for technical or editorial errors or
 * omissions contained herein. The information contained herein is subject to change without notice.
 *
 * @author xiaojing on 09/10/2022.
 */

package io.github.janezhangoo;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}