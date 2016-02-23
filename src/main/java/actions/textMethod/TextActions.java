package actions.textMethod;

import java.util.Arrays;

public class TextActions {
    public void swapTextString(String text) {
        String b = new StringBuffer(text).reverse().toString();
        System.out.println(b + " -->reverse String");
    }

    public void swapTextArray(String text) {
        char[] arr = text.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int k=i+1; k<arr.length;k++){
                char temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
            System.out.print(arr[i]);
        }
        System.out.println(Arrays.toString(arr) + " -->reverse array char");
    }
}
