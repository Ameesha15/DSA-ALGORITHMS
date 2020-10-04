import java.util.Arrays;

public class ArrayTest {

    //add a element to the last of the Array
    public static void main(String[] args) {
        int[] arr = new int[] {9,8,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.toString());
        int dst = 6;
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=dst;
        arr = newArr;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.toString());
    }
}
