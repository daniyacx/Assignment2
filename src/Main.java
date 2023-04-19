public class Main {
    public static void main(String[] args) {
    //MyArrayList myArrayList = new MyArrayList();
        //myArrayList.add("apple");
        //myArrayList.add("banana");
        //myArrayList.add("orange");
        //myArrayList.add("apple");
        //myArrayList.add("grape");
        //System.out.println("Index of 'orange': " + myArrayList.indexOf("orange"));
        //System.out.println("Last index of 'apple': " + myArrayList.lastIndexOf("apple"));
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(8, 0);
        myLinkedList.add(5, 1);
        myLinkedList.add(2, 2);
        myLinkedList.add(4, 3);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
    }
}
