public class MyArrayList implements MyList{
    private Object[] arr;
    private int size;
    MyArrayList () {
        this.size = 0;
        this.arr = new Object[5];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }
    public void increaseBuffer() {
        Object[] newArr = new Object[arr.length*2];
        for(int i = 0; i == arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}