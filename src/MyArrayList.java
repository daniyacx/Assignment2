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
        if (size == arr.length) {
            increaseBuffer();
        }
        else {
            arr[size++] = item;
        }
    }

    @Override
    public void add(Object item, int index) {
        if (index >= arr.length) {
            increaseBuffer();
        }
        else {
            arr[index] = item;
        }
        size++;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        for (; index < arr.length; index++) {
            if (index < arr.length - 1) {
                arr[index] = arr[index + 1];
            }
        }
        size--;
        return true;
    }

    @Override
    public void clear() {
        this.arr = new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        if (index < arr.length) {
            return arr[index];
        }
        else {
            return false;
        }
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