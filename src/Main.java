public class Main {
    public static void main(String[] args) {
        MyArrayList ArrayList = new MyArrayList();
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4, 2);
        System.out.println(ArrayList.size());
        System.out.println(ArrayList.get(2));
    }
}