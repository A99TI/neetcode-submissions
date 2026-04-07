class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this(val, null);
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}

class Deque {

    ListNode head;
    ListNode tail;

    public Deque() {
        ListNode dummy = new ListNode(-1);
        this.head = dummy;
        this.tail = dummy;

    }

    public boolean isEmpty() {
        if (this.head == this.tail){
            return true;
        }
        return false;

    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (this.tail == this.head) {
            this.tail = newNode;
        }
    }

    public int pop() {
        if (this.head == this.tail) return -1;

        ListNode pre = this.head;
        while (pre.next != this.tail) {
            pre = pre.next;
        }

        int val = this.tail.val;
        pre.next = null;
        this.tail = pre;

        return val;
    }

    public int popleft() {
        if (this.head == this.tail) return -1;

        if (this.head.next == this.tail) this.tail = this.head;

        ListNode returnNode = this.head.next;
        this.head.next = this.head.next.next;
        returnNode.next = null;

        return returnNode.val;
        
    }
}
