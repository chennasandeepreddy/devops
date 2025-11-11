import logical.PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>();
        String s = "sandeep";
        lis.add("sandeep");
        lis.add("chenna");
        int count=0;
        if(lis.contains(s)){
            count++;
            System.out.println(count);
        }
        System.out.println(lis.get(0));
    }
}