package spiralMatrixBasics;

public class leftUpward {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        int left=0;
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i][left]);
        }
    }
}
