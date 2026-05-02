/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();
        
        Node dummy1 = new Node(0);
        
        Node p1 = dummy1;
        Node p2 = head;
        while (p2 != null){
            Node newNode =  new Node(p2.val);
            p1.next = newNode;
        
            p1 = newNode;
            map.put(p2, p1);

            p2 = p2.next;
        }

        p1 = dummy1.next;
        p2 = head;
        while (p2 != null){
            p1.random = map.get(p2.random);
            p1 = p1.next;
            p2 = p2.next;
        }

        return dummy1.next;
    
        
    }
}
