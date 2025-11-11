package assignment4;

public class PythagorianTriplet {
    public static void main(String[] args) {
        int arr[] = new int[]{3,4,1,2};
        boolean res  = findPythagorianTriplet(arr);
        System.out.println(res);
    }

    private static boolean findPythagorianTriplet(int arr[]) {
        int a=0,b=0,c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    a = (int) Math.pow(arr[i],2);
                    b = (int)Math.pow(arr[j],2);
                    c = (int)Math.pow(arr[k],2);

                    if(a==b+c || b==a+c || c==b+a){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
