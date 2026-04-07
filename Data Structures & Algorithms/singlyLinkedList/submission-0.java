
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {

    ListNode head;
    ListNode tail;

    public LinkedList() {
        ListNode dummy = new ListNode(-1);
        this.head = dummy;
        this.tail = dummy;
    }

    public int get(int index) {
        if (index < 0) return -1;

        int i = 0;
        int target = index + 1;
        ListNode curr = this.head;

        while (curr != null) {
            if (i == target) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = this.head.next;
        this.head.next = newNode;

        if (this.tail == this.head) {
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public boolean remove(int index) {
        if (index < 0) return false;

        int i = 0;
        int target = index;
        ListNode pre = this.head;

        while (pre.next != null) {
            if (i == target) {
                if (pre.next == this.tail) this.tail = pre;
                pre.next = pre.next.next;
                return true;
            }
            i++;
            pre = pre.next;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {

        ListNode curr = this.head.next;
        ArrayList<Integer> nums = new ArrayList<>();
        
        while (curr != null){
            nums.add(curr.val);
            curr = curr.next;
        }

        return nums;

    }
}
