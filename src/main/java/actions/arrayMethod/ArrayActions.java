package actions.arrayMethod;

import java.util.Arrays;

class ArrayActions {
    public void sortArraySelectionsAsc(int[] arr) {
        System.out.println(Arrays.toString(arr) + " start");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < min) {
                    min = arr[k];
                    minIndex = k;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr) + " sort selections asc");
    }

    public void sortArraySelectionsDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] > min) {
                    min = arr[k];
                    minIndex = k;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr) + " sort selections desc");
    }

    public void sortArrayBubbleAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + " sort bubble asc");
    }

    public void sortArrayBubbleDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + " sort bubble desc");
    }

    public void findMinAndMaxAndSwapMinAndMax(int[] arr) {
        System.out.println(Arrays.toString(arr) + " before");
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println(" max value: " + max + " and min value: " + min);
        for (int k = 0; k < arr.length; k++) {
            int temp = arr[indexMax];
            arr[indexMax] = arr[indexMin];
            arr[indexMin] = temp;
        }
        System.out.println(Arrays.toString(arr) + "swap min and max");
    }

    public void swapMainDiagonal(int[][] arr) {
        System.out.println("After:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ";");
                if (j == 2) {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = i + j;
                if (sum == (i + j) & i != j & i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + ";");
                if (j == 2) {
                    System.out.println();
                }
            }
        }
    }
}
