package spiralMatrixBasics;

public class RightMostColumn {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        int right=arr.length-1;
        for(int row=0;row<=right;row++){
            System.out.println(arr[row][right]);
        }
    }
}
