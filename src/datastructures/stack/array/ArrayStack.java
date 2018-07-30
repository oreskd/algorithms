package datastructures.stack.array;

import datastructures.list.array.ArrayList;

public class ArrayStack<T> {
    private ArrayList<T> arrayList;

    public ArrayStack() {
        arrayList = new ArrayList<>();
    }

    public void push(T element) {
        int index = arrayList.size();
        arrayList.add(index, element);
    }

    public T pop() {
        int index = arrayList.size() - 1;
        T element = arrayList.remove(index);
        return element;
    }
}

