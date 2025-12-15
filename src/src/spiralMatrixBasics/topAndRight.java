package spiralMatrixBasics;

public class topAndRight {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3,24},{19,2,1},{9,3,5}};
        int top=0,right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[top][i]);
        }
        top++;
        for (int i=top;i< arr.length;i++){
            System.out.println(arr[i][right]);
        }
    }
}
