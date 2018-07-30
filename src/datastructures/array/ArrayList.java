package datastructures.array;

import java.util.Arrays;

public class ArrayList<T> {
    private T[] arr;
    private int size;

    public ArrayList() {
        arr = (T[]) new Object[1];  // initial size is 1; later gets increased/decreased to 2, 4, 8, 16... as needed
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return arr[index];
    }

    public T set(int index, T element) {
        T oldElement = arr[index];
        arr[index] = element;
        return oldElement;
    }

    public void add(int index, T element) {
        if (size >= arr.length) {
            resize();  // increase the size in order to be able to add the new element
        }
        System.arraycopy(arr, index, arr, index+1, size-index);
        arr[index] = element;
        size++;
    }

    public T remove(int index) {
        T element = arr[index];
        System.arraycopy(arr, index+1, arr, index, size-index-1);
        arr[size-1] = null;  // after copying, this element was left unchanged and therefore should be unset
        size--;
        if (3*size <= arr.length) {
            resize();  // reduce the size to not use more memory than needed
        }
        return element;
    }

    private void resize() {
        int newSize = Math.max(2*size, 1);  // avoid newSize=0 for size=0
        T[] newArr = (T[]) new Object[newSize];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }


    // this is not related to the data structure itself, but is useful for Demo purposes
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
