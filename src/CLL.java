public class CLL {
    private Node head;
    private  Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.value+" => ");
                node = node.next;
            }while(node!=head);
            System.out.print("Head");
        }
    }

    public void delete(int value){
        Node node = head;
        if(head == null){
            return;
        }
        if (node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node nd = node.next;
            if(nd.value==value){
                node.next=nd.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
