package com.example.algorithm_test.dataStructure.linkedListAlg;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    // * Node 삽입 (중간에 삽입)
    public void insertNode(ListNode preNode, String data) {
        ListNode newNode = new ListNode(data);
        newNode.link = preNode;
        preNode.link = newNode;
    }

    public void insertNode(String data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            this.head = newNode;
        } else {
            ListNode tempNode = head;
            while (tempNode.link != null) {
                tempNode = tempNode.link;
            }
            tempNode.link = newNode;
        }
    }

    // * Node 삭제 (중간 노드 삭제)
    public void deleteNode(String data) {
        ListNode preNode = head;
        ListNode tempNode = head.link;

        if (data.equals(preNode.getData())) {
            head = preNode.link;
            preNode.link = null;
        } else {
            while (tempNode != null) {
                if (data.equals(tempNode.getData())) {
                    if (tempNode.link == null) {
                        preNode.link = null;
                    } else {
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }

    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;

        if (head == null) {
            return;
        }

        if (head.link == null) {
            head = null;
        } else {
            preNode = head;
            tempNode = head.link;
            while (tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            preNode.link = null;
        }
    }

    public ListNode searchNode (String data) {
        ListNode tempNode = this.head;
        while (tempNode != null) {
            if (data.equals(tempNode.getData())) {
                return tempNode;
            } else {
                tempNode = tempNode.link;
            }
        }
        return tempNode;
    }

    public void printList() {
        ListNode tempNode = this.head;

        while (tempNode != null) {
            System.out.println(tempNode.getData() + " ");
            tempNode = tempNode.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        String str = "수요일";
        linkedList.insertNode("일요일");
        linkedList.insertNode("월요일");
        linkedList.insertNode("화요일");
        linkedList.insertNode("목요일");
        linkedList.insertNode("금요일");
        linkedList.insertNode("토요일");

        System.out.println("==> " + linkedList.searchNode(str).getData());
    }
}
