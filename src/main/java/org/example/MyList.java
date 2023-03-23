package org.example;

import java.util.Arrays;

public class MyList<T> {

    private int size = 0;

    private static final int INIT_CAPACITY = 10;

    private Object[] elements;

    public MyList() {
        elements = new Object[INIT_CAPACITY];
    }

    /**
     * My best method to add elements to the best implementation of the list int the world
     * @param element It's just an element
     */
    public void add(T element){
        if (size == elements.length){
            grow();
        }

        elements[size++] = element;
    }

    private void grow(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        return (T) elements[index];
    }


}
