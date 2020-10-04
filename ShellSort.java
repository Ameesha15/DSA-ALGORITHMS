import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,9,8,1,4,5,6,0,1,2,6,9};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort(int[] arr){
        //遍历所有的步长
        for(int d = arr.length/2;d>0;d/=2){
            //遍历所有的元素
            for(int i=d ;i<arr.length;i++){
                int j = i-d;
                while(j>=0&&arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j-=d;
                }
            }
        }
    }
}
