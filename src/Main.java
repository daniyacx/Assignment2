public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(5);
        myArrayList.add(20);
        myArrayList.add(15);
        myArrayList.add(25);
        System.out.println("Before sorting:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        myArrayList.sort();
        System.out.println("After sorting:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}