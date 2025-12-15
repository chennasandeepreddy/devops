package spiralMatrixBasics;

public class Array1D {
    public static void main(String[] args) {
        int[] arr= {1,5,7,12};

        //left to right
        System.out.println("Printing left to right: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        System.out.println("Printing right to left: ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}
