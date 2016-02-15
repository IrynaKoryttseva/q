import java.util.Arrays;

public class TextActions {
    public void swapTextString(String text){
        System.out.println(text);
        String b = new StringBuffer(text).reverse().toString();
        System.out.println(b+" -->reverse String");
    }

    public void swapTextArray(String text){
        char[] ch=text.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int k=i+1;k<ch.length;k++){
                char temp =ch[i];
                ch[i]=ch[k];
                ch[k]=temp;
            }
        }
        System.out.println(Arrays.toString(ch)+" -->reverse array char");
    }
}
