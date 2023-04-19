public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("apple");
        myArrayList.add("banana");
        myArrayList.add("orange");
        myArrayList.add("apple");
        myArrayList.add("grape");
        System.out.println("Index of 'orange': " + myArrayList.indexOf("orange"));
        System.out.println("Last index of 'apple': " + myArrayList.lastIndexOf("apple"));
    }
}