package datastructures.queue.array;

public class ArrayQueue<T> {
    T[] arr;
    int oldestIndex;  // index of the oldest added element
    int size;

    public ArrayQueue() {
        arr = (T[]) new Object[1];  // initial size is 1; later gets increased/decreased to 2, 4, 8, 16... as needed
    }

    public void add(T element) {
        if (size >= arr.length) {
            resize();  // increase the size in order to be able to add the new element
        }
        int index = (oldestIndex + size) % arr.length;  // circular array
        arr[index] = element;
        size++;
    }

    public T remove() {
        T element = arr[oldestIndex];
        arr[oldestIndex] = null;
        oldestIndex = (oldestIndex + 1) % arr.length;  // circular array
        size--;
        if (3*size <= arr.length) {
            resize();  // reduce the size to not use more memory than needed
        }
        return element;
    }

    private void resize() {
        int newSize = Math.max(2*size, 1);  // avoid newSize=0 for size=0
        T[] newArr = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(oldestIndex + i) % arr.length];  // circular array
        }
        arr = newArr;
        oldestIndex = 0;
    }
}
