package by.epam.linear_program.main;

import java.util.Random;

public class Main49 {
    public static void main(String[] args) {
        // 5. Сортировка Шелла. Требуется упорядочить его по возрастанию. Делается это следующим образом:
        // сравниваются два соседних элемента ai и ai+1. Если ai<= ai+1, то продвигаются на один элемент вперед.
        // Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.

        int k;
        int masLength = 10;

        Random rand = new Random();

        int[] mas = new int[masLength];
        for (int i = 0; i < mas.length; ++i) {
            mas[i] = rand.nextInt(100);
            System.out.printf("% 3d ", mas[i]);
        }
        System.out.println();
        System.out.println(".......................................");

        for (int j = masLength / 2; j > 0; j = j / 2)
            for (int i = j; i < masLength; i++) {
                int tmp = mas[i];
                for (k = i; k >= j; k -= j) {
                    if (tmp < mas[k - j]) {
                        mas[k] = mas[k - j];
                    } else {
                        break;
                    }
                }
                mas[k] = tmp;
            }
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 3d ", mas[i]);
        }
    }
}