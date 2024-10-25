package org.example;

public class Container {

    private int size = 0;
    private String[] array = new String[5];
    
    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public void add(String... elements) {
        for (String element : elements) {
            if (size == array.length) {
                resizeArray();
            }
            array[size] = element;
            size++;
        }
    }

    private void resizeArray() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(element)) {
                remove(i);
                return;
            }
        }
    }
}
