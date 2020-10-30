package by.epam.linear_program.main;

import java.util.Random;

public class Main46 {
    public static void main(String[] args) {
        // 2. Сортировка выбором. Требуется переставить элементы так, чтобы они были расположены по убыванию.
        // Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
        // Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

        int[] mas = new int[10];

        randomMasElement(mas, 100);
        printMas(mas);

        masSortChoice(mas);
        printMas(mas);
    }

    private static void masSortChoice(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            int max = mas[i];
            int maxI = i;

            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    maxI = j;
                }
            }
            if (i != maxI) {
                int tmp = mas[i];
                mas[i] = mas[maxI];
                mas[maxI] = tmp;
            }
        }
    }

    private static void randomMasElement(int[] mas, int a) {
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(a);
        }
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 3d ", mas[i]);
        }
        System.out.println();
        System.out.println("......................................");
    }
}