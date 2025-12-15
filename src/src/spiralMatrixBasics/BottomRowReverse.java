package spiralMatrixBasics;

public class BottomRowReverse {
    public static void main(String[] args) {
        //col taking - arr[i] row taking -arr
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        int bottom = arr[0].length-1;
        for(int i=bottom;i>=0;i--){
            System.out.println(arr[bottom][i]);
        }
    }
}
