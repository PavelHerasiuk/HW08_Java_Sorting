package by.epam.linear_program.main;

import java.util.Arrays;

public class Main48 {
    public static void main(String[] args) {
        // 4. Сортировка вставками.

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        System.out.println(".......................");

        for (int left = 0; left < array.length; left++) {
            int value = array[left];     // Вытаскиваем значение элемента
            int i = left - 1;            // Перемещаемся по элементам, которые перед вытащенным элементом
            for (; i >= 0; i--) {
                if (value < array[i]) {  // Если вытащили значение меньшее — передвигаем больший элемент дальше
                    array[i + 1] = array[i];
                } else {
                    break;               // Если вытащенный элемент больше — останавливаемся
                }
            }
            array[i + 1] = value;        // В освободившееся место вставляем вытащенное значение
        }
        System.out.println(Arrays.toString(array));
    }
}