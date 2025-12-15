package spiralMatrixBasics;

public class GridMovement {
    public static void main(String[] args) {
        int top=0;
        int[][] arr= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int col=0;col<arr.length;col++){
            System.out.print(arr[top][col]);
        }
        top++;
        for(int row= 1;row< arr.length;row++){
            System.out.print(arr[row][arr.length-1]);
        }
        for(int col=arr.length-2;col>=0;col--){
            System.out.print(arr[arr.length-1][col]);
        }
        for(int row=1;row<=arr.length-2;row++){
            System.out.println(arr[row][0]);
        }
    }
}
