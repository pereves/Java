package Homework_Java.HW4;

import java.util.Scanner;

public class HeapSort {
    public static void sort(int[] arr) {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }

    public static void print(int[] array, String text) {
        System.out.println(text);
        for (int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите элементы массива через пробел: ");
            String rawInput = input.nextLine();
            String[] array = rawInput.split(" ");
            int[] original = new int[array.length];
            for (int i = 0; i < original.length; i++)
                original[i] = (Integer.parseInt(array[i]));
            print(original, "Исходный массив:");
            sort(original);
            print(original, "Отсортированный массив:");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}