package spiralMatrixBasics;

public class topRightBottom {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        int top=0,right=arr.length-1,bottom=arr[0].length-1;
        for(int i=0;i<arr[0].length;i++){
            System.out.println(arr[top][i]);
        }
        top++;
        for(int i=top;i<arr.length;i++){
            System.out.println(arr[i][right]);
        }
        right--;
        for (int i=right;i>=0;i--){
            System.out.println(arr[bottom][i]);
        }
        bottom--;
    }
}
