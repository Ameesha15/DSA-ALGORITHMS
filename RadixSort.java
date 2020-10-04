import java.lang.reflect.Array;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23,6,189,45,9,287,56,1,798,34,65,653,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        //save the maximal number of the array;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //decide how much round should we take
        int round = (max+"").length();
        //define a two-dimensional array to store numbers
        int[][] temp = new int[10][arr.length];
        //define a array to count numbers in each col of the two-dimensional array
        int[] counts = new int[10];
        for(int i=0,n=1;i<round;i++,n*=10) {
            //take the reminder of each number in the arr
            for (int j = 0; j < arr.length; j++) {
                int reminder = arr[j] / n % 10;
                //把当前遍历的数字放到指定的数组中
                temp[reminder][counts[reminder]] = arr[j];
                counts[reminder]++;
            }
            //记录取的元素需要放的位置;
            int index = 0;
            for(int k=0;k<counts.length;k++){
                //记录数量的数组中当前余数记录的数量不为零
                if(counts[k]!=0){
                    //循环取出元素
                    for(int l = 0;l<counts[k];l++){
                        //取出元素
                        arr[index]=temp[k][l];
                        index++;
                    }
                    counts[k]=0;
                }
            }
        }

    }
}
