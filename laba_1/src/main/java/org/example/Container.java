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
}
