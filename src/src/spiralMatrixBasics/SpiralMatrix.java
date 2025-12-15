package spiralMatrixBasics;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            int top = 0, bottom = matrix.length - 1;
            int left = 0, right = matrix[0].length - 1;
            List<Integer> list1 = new ArrayList<>();
            while(left<=right && top<=bottom){
                for(int i=left;i<=right;i++){
                    list1.add(matrix[top][i]);
                }
                top++;
                for(int j=top;j<=bottom;j++){
                    list1.add(matrix[j][right]);
                }
                right--;
                if(top<=bottom){
                    for(int k=right;k>=left;k--){
                        list1.add(matrix[bottom][k]);
                    }
                    bottom--;
                }
                if(left<=right){
                    for(int l=bottom;l>=top;l--){
                        list1.add(matrix[l][left]);
                    }
                    left++;
                }
            }
            return list1;
        }

}
