package actions.textMethod;

class MainTextMethod {
    public static void main(String[]args){
        //actions with text
        String text = "Hello world!";
        TextActions textActions = new TextActions();
        textActions.swapTextString(text);
        textActions.swapTextArray(text);
    }
}
