package assignment5;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int image[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]= flipAndInvertImage(image);
        for(int[] arr:result){
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] temp = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for (int j=0;j<image[i].length;j++){
                temp[i][j]=image[i][j];
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=1;j<=image[i].length;j++){
                temp[i][j-1] = image[i][image[j-1].length-j];
                if(temp[i][j-1]==0){
                    temp[i][j-1]=1;
                }
                else{
                    temp[i][j-1]=0;
                }
            }
        }
        return temp;
    }
}
