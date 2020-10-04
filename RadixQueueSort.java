import java.util.Arrays;
public class RadixQueueSort {
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

        MyQueue[] temp  = new MyQueue[10];
        for(int i = 0;i<temp.length;i++){
            temp[i] = new MyQueue();
        }
        for(int i=0,n=1;i<round;i++,n*=10) {
            //take the reminder of each number in the arr
            for (int j = 0; j < arr.length; j++) {
                int reminder = arr[j] / n % 10;
                //把当前遍历的数字放到指定的队列中
                temp[reminder].add(arr[j]);
            }
            //记录取的元素需要放的位置;
            int index = 0;
            for(int k=0;k<temp.length;k++){
                    //循环取出元素
                while(!temp[k].isEmpty()) {
                    arr[index]=temp[k].poll();
                    index++;
                }
            }
        }

    }
}
