import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int [] arr=  new int[]{3,4,5,7,1,2,0,3,6,8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectSort(int[] arr){
        //遍历所有的数
        for(int i=0;i<arr.length;i++){
            //从0开始初始最小下标
            int minIndex = i;
            //把当前遍历的数和后面所有数比较，记录下最小的数的下标
            for(int j = i+1;j<arr.length;j++){
                //如果后面比较的数比记录的最小数字小
                if(arr[minIndex]>arr[j]){
                    //记录下最小的那个数的下标
                    minIndex = j;
                }
            }
            //如果找了一遍没有比它小的数便不必交换
            if(i!=minIndex){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
