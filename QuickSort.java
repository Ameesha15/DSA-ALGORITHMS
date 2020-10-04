
import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,6,7,2,7,2,8,0,9};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuickSort(int[] data,int left,int right){
        if(left<right){
            int low = left;
            int high = right;
            int base = data[left];
            while(low<high){
                //from right side
                while(low<high&&base<=data[high]){
                    high--;
                }
                //swap
                data[low]=data[high];
                //from left side
                while(low<high&&base>=data[low]) {
                    low++;
                }
                data[high]=data[low];
            }
            data[low]=base;
            QuickSort(data,left,low);
            QuickSort(data,low+1,right);
        }
    }
}