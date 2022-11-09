public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();

        linkedList.insertFirst(43);
        linkedList.insertFirst(14);
        linkedList.insertFirst(34);
        linkedList.insertFirst(12);

        linkedList.insertLast(23);

        linkedList.insert(53,2);
        linkedList.delete(2);

        linkedList.display();

        System.out.println(linkedList.find(124));

    }
}