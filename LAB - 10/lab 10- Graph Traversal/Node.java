//DO NOT CHANGE THIS CLASS
class Node {
    Object elem;
    Node next;
    public Node(Object elem) {
        this.elem = elem;
        this.next = null;
    }

    public Node(Object elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

