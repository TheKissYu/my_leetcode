package leetCode.myLinkedList;

public class MyLinkedList {
    public class Node{
        public Node(){

        }
        public Node(int val){
            this.val =val;
        }
        public int val;
        public Node pre;
        public Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= size){
            return -1;
        }
        int flag = index;
        Node tmp ;
        if (flag<size/2){
            tmp = head;
            while (index >= 0){
                tmp = tmp.next;
                flag -- ;
            }
        }else {
            flag = size - index;
            tmp = tail;
            while (flag > 0){
                tmp = tmp.pre;
                flag --;
            }
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        if (head != null ){
            Node node = new Node();
            node.val = val;
            head.pre = node;
            node.next =head;
            head = node;
        }else {
            head = new Node();
            head.val = val;
        }
        size ++;
    }

    public void addAtTail(int val) {
        if (head == null){
            head = new Node();
            tail = head;
            head.val = val;
        }else {
            Node node = new Node();
            node.val =val;
            tail.next = node;
            tail = node.next;
        }
        size ++;
    }

    private Node getNodeByIndex(int index){
        Node tmp = null;
        if (index <= size){
            int flag = index;
            if (flag < size/2){
                tmp = head;
                while (flag > 0){
                    tmp= tmp.next;
                }
            }else {
                flag = size - flag;
                tmp = tail;
                while (flag > 0){
                    tmp = tmp.pre;
                }
            }
        }
        return tmp;
    }
    public void addAtIndex(int index, int val) {
        if (index <= size){
            Node node = new Node(val);
            if (index == 0){
                node.next = head;
                head = node;

            }else if (index == size-1){

            }else {
                Node tmp = getNodeByIndex(index - 1);
                node.next = tmp.next;
                tmp.next = node;
            }
            size++;
        }
    }

    public void deleteAtIndex(int index) {

    }
}
