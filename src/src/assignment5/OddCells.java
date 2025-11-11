package assignment5;

public class OddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int row=0;row<n;row++){ //updating columns
                matrix[indices[i][0]][row]++;
            }
            for(int column=0;column<m;column++){ //updating rows
                matrix[column][indices[i][1]]++;
            }
        }
        int count=0;
        for(int[] arr:matrix){
            for(int val:arr){
                if(val%2!=0){
                    count++;
                }
            }
        }
        return count;

    }
}
