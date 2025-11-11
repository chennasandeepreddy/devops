package assignment5;

import java.util.ArrayList;
import java.util.List;

public class Candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        int i=1;
        int j=1;
        for(int candy:candies){
            if(candies[i-1]>=max){
                max = candies[i-1];
            }
            i++;
        }
        for(int candy:candies){
            if((candies[j-1]+extraCandies)>=max){
                result.add(true);
            }
            else
                result.add(false);
            j++;
        }
        return result;
    }
}
