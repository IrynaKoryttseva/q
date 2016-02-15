import java.util.Arrays;

class ArrayActions {
    public void sortArraySelectionsAsc(int[] arr) {
        System.out.println(Arrays.toString(arr) + " start");
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
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
            int maxValue = arr[i];
            int indexMax = i;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] > maxValue) {
                    maxValue = arr[k];
                    indexMax = k;
                }
            }
            if (i != indexMax) {
                int temp = arr[i];
                arr[i] = arr[indexMax];
                arr[indexMax] = temp;
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

    public void findMinAndMaxAndswapMinAndMax (int[] arr) {
        System.out.println(Arrays.toString(arr)+" before");
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        System.out.println(" max value: "+max+" and min value: "+min);
        for(int i=0; i<arr.length;i++){
            int temp =arr[minIndex];
            arr[minIndex]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        System.out.println(Arrays.toString(arr)+"swap min and max");
    }


}
