public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(6);
        list.delete(1);
        list.display();
    }
}