package by.epam.linear_program.main;

import java.util.Random;

public class Main47 {
    public static void main(String[] args) {
        // 3. Сортировка обменами. Требуется переставить числа в порядке возрастания. Для
        // этого сравниваются два соседних числа ai и ai+1. Если ai> ai+1, то делается перестановка. Так продолжается до тех
        // пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки,
        // подсчитывая при этом количества перестановок.

        int[] mas = new int[10];

        randomMasElement(mas, 100);
        printMas(mas);

        masSortExchange(mas);
        printMas(mas);
    }

    private static void masSortExchange(int[] mas) {
        int temp;
        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    count++;
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
        }
        System.out.println("Количество перестановок = " + count);
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
        System.out.println(".......................................");
    }
}