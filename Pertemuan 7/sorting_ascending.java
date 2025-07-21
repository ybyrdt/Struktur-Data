/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author ACER
 */
public class sorting_ascending {

    public static void main(String[] args) {
        int[] data = {4, 10, 5, 7, 11};

        sortInsertion(data.clone(), "Insertion Sort");
        sortSelection(data.clone(), "Selection Sort");
        sortBubble(data.clone(), "Bubble Sort");
    }

    static void sortInsertion(int[] arr, String title) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        print(title, arr);
    }

    static void sortSelection(int[] arr, String title) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i]; arr[i] = arr[min]; arr[min] = temp;
        }
        print(title, arr);
    }

    static void sortBubble(int[] arr, String title) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
        print(title, arr);
    }

    static void print(String method, int[] arr) {
        System.out.print(method + ": ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}

