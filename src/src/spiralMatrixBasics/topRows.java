package spiralMatrixBasics;

public class topRows {
    public static void main(String[] args) {
        int top=0;
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        for(int col=0;col<arr[0].length;col++){
            System.out.println(arr[top][col]);
        }
    }
}
