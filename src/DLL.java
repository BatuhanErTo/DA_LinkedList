public class DLL {
    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if(head != null) {
            head.previous = node;
        }
        head = node;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
            node.previous = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.previous = last;
    }

    public void insert(int after,int value){
        Node node = new Node(value);
        Node prev = find(after);
        node.previous = prev;
        node.next = prev.next;
        if (prev.next != null) {
            prev.next.previous = node;
        }
        prev.next = node;
    }
    public Node find(int value){
        Node temp = head;
        while (temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void delete(int value){
        Node node = find(value);
        if (head == null || node == null){
            return;
        }
        if(head == node){
            head = node.next;
            head.previous = null;
        }
        if (node.previous != null){
            node.previous.next = node.next;
        }
        if(node.next != null){
            node.next.previous = node.previous;
        }
        return;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value+" => ");
            last = node;
            node = node.next;
        }
        System.out.print("End");
        System.out.println();
        while(last!= null){
            System.out.print(last.value+" => ");
            last = last.previous;
        }
        System.out.print("Start");
    }

    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next,Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
