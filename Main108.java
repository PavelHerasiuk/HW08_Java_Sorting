package by.epam.linear_program.main;

import java.util.Arrays;

// Сортировка слиянием - merge sort.
public class Main108 {
    public static void main(String[] args) {
        int[] array1 = {7, 0, 3, 5, 6, 9, 8, 4, 2, 10, 1};
        int[] result = mergeSort(array1);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    private static int[] mergeSortInner(int[] buffer1, int[] buffer2,
                                        int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    //   buffer1    Массив для сортировки.
    //   buffer2    Буфер. Размер должен быть равен размеру buffer1.
    //   startIndex Начальный индекс в buffer1 для сортировки.
    //   endIndex   Конечный индекс в buffer1 для сортировки.
}
