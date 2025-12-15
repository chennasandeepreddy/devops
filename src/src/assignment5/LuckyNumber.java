package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        int min=0;
        int max=0;
        int count=0;
        for(int i=0;i<matrix.length;i++){
            min=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<=min){
                    min=matrix[i][j];
                }
            }
            minList.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>=max){
                    max=matrix[j][i];
                }
            }
            maxList.add(max);
            max=0;
        }
        System.out.println(minList);
        System.out.println(maxList);
        int result;
        List<Integer> resultList= new ArrayList<>();
        int maxOfLis2 = Collections.max(minList);
        int minOfLis = Collections.min(maxList);
        if(maxOfLis2==minOfLis){
            resultList.add(maxOfLis2);
        }
        return resultList;
    }
}
