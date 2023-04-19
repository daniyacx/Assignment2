public class MyArrayList<T> {
        private T[] arr;
        private int size;

        // Initializes the array with a default capacity of 5 and sets size to 0
        MyArrayList(){
            this.arr = (T[]) new Object[5];
            this.size = 0;
        }

        // Adds an element to the end of the array
        public void  add(T element){
            // If the array is full, double its capacity
            if(size == arr.length){
                increaseBuffer();
            }
            arr[size++] = element;
        }
        public void increaseBuffer(){
            T[] newArr = (T[]) new Object[arr.length*2];
            for(int i=0; i< arr.length; i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
        }
        public T getElement(int index) {
            checkIndex(index);
            return arr[index];
        }
/**
     @getSize() - return the size of ArrayList
     @noParameters
     @return int
**/
        public int getSize() {
            return size;
        }
        public void clear(){
            this.arr = (T[]) new Object[5];
            this.size = 0;
        }
        public void delete(int index){
            checkIndex(index);
            for(int i= index + 1; i<size; i++){
                arr[i-1] = arr[i];
            }
            size--;
        }
        // Throws an exception if the specified index is out of bounds
        public void checkIndex(int index){
            if(index < 0 || index>=size){
                throw new IndexOutOfBoundsException();
            }
        }
    }
