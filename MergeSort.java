import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,4,6,8,10};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int low,int high){
        int middle = (high+low)/2;
        if(low<high){
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
    }
    public static void merge(int[] arr,int low,int middle,int high ){
        //用于存储归并后的临时数组
        int[] temp = new int[high-low+1];
        //用于记录第一个数组中需要遍历的下标
        int i = low;
        //用于记录第二个数组中需要遍历的下标
        int j = middle+1;
        //用于记录在临时数组中存放的下标
        int index= 0;
        //遍历两个数组取出小的数字放入临时数组中
        while(i<=middle&&j<=high){
            //第一个数组的数更小
            if(arr[i]<arr[j]){
                //把小的数放进临时数组里
                temp[index]=arr[i];
                i++;
            }
            else{
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
        //把剩余的数组放入临时数组;
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }
        while(i<=middle){
            temp[index]=arr[i];
            i++;
            index++;
        }
        //把临时数组里的数据放入原数组
        for(int k=0;k<temp.length;k++){
            arr[k+low]=temp[k];
        }


    }
}
