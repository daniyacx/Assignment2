# Assignment2
## Description
I need to create classes **MyArrayList** and **MyLinkedList** which are implementations of ArrayList and LinkedList respectively.
I'm not allowed to use **java.util.ArrayList** and **java.util.LinkedList!**
Both of classes should implement an interface **MyList**
## MyArrayList
This is a simple implementation of the `MyList` interface using an array to store the elements. The `MyArrayList` class provides methods to add, remove, and access elements in the list. It also provides methods to check if an element is present in the list and to sort the elements.
### Method Description
size() - returns the number of items in the list;
contains(Object o) - returns true if the specified element is in the list, false - otherwise;
add(T item) - adds the specified item to the end of the list;
add(T item, int index) - adds the specified item to the specified place in the list;
remove(T item) - removes the first occurrence of the specified item from the list, if there is one;
remove(int index) - removes an item with the specified index from the list;
clear() - removes all items from the list;
get(int index) - returns the element located in the specified place in the list;
indexOf(Object o) - returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found;
lastIndexOf(Object o) - returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found;
### Solution
