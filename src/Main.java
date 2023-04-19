public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(90);
        myArrayList.add(80);
        myArrayList.add(70);
        myArrayList.add("dog");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.remove("dog"));
    }
}