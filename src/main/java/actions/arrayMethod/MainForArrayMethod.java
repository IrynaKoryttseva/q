package actions.arrayMethod;

class MainForArrayMethod {
    public static void main(String[]args){
        //actions with array 1 level
        int [] number = {4,-200,0,0,21,45,-34};
        ArrayActions arrayActions = new ArrayActions();
        arrayActions.sortArraySelectionsAsc(number);
        arrayActions.sortArraySelectionsDesc(number);
        arrayActions.sortArrayBubbleAsc(number);
        arrayActions.sortArrayBubbleDesc(number);
        arrayActions.findMinAndMaxAndSwapMinAndMax(number);
        //actions with array 2 level
        int [][]arr = new int [3][3];
        arr[0][0]=1;
        arr[0][1]=23;
        arr[0][2]=-56;
        arr[1][0]=12;
        arr[1][1]=1;
        arr[1][2]=15;
        arr[2][0]=0;
        arr[2][1]=14;
        arr[2][2]=1;
        arrayActions.swapMainDiagonal(arr);
    }
}
