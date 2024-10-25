package org.example;

/**
 * Класс контейнер со свойствами <b>size</b> и <b>array</b>.
 * * @autor Никульникова Лилия
 */
public class Container {
    /**
     * Поле количество элементов
     */
    private int size = 0;
    /**
     * Поле массив строк
     */
    private String[] array = new String[5];

    /**
     * Функция получения значения поля {@link Container#size}
     *
     * @return возвращает количество элементов в массиве
     */
    public int getSize() {
        return size;
    }

    /**
     * Функция получения значения элемента поля {@link Container#array}
     *
     * @param index - индекс массива
     * @return возвращает элемент массива по индексу
     */
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    /**
     * Функция добавления в массив  {@link Container#array}
     *
     * @param elements - элементы/элемент массива
     */
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

    /**
     * Функция удаления элемента массива по индексу {@link Container#array}
     *
     * @param index - индекс массива
     */
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

    /**
     * Функция удаления элемента массива  {@link Container#array}
     *
     * @param element - строка
     */
    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(element)) {
                remove(i);
                return;
            }
        }
    }
}
