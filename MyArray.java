import javax.naming.event.ObjectChangeListener;
import java.util.Arrays;

public class MyArray{
    //for store data;
    private int [] elements;
    public MyArray(){
        elements = new int[0];
    }
    public int size(){
        return elements.length;
    }
    //往数组末尾增加一个元素
    public void add(int element){
        int [] newArr = new int[elements.length+1];
        for(int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    //打印所有元素到控制台；
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
    //删除一个数组中的一个元素
    public void delete(int index){
        //判断下标越界
        if(index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length-1];
        for(int i=0;i<newArr.length;i++){
            if(i<index){
                newArr[i]=elements[i];
            }else{
                newArr[i]=elements[i+1];
            }
        }
        elements= newArr;
    }
    //fetch an element of the array according to the given index
    public int get(int index){
        if(index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }
    //insert an element to a position according to the given index
    public void insert(int index,int value){
        //传入index的检查
        if(index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length+1];;
        for(int i = 0;i<newArr.length;i++){
            if(i<index){
                newArr[i]=elements[i];
            } else if(i==index){
                newArr[i] = value;
            } else{
                newArr[i]=elements[i-1];
            }
        }
        elements = newArr;
    }
    public void set(int index,int value){
        if(index<0||index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        elements[index]=value;
    }
    //orderSearch
    public Object search(int value){
        for(int i=0;i<elements.length;i++){
            if (elements[i]==value) {
                return  i;
            }
        }
        return -1;
    }
    //binarySearch

    public int binarySearch(int target){
        int begin = 0;
        //end
        int end = elements.length-1;
        //intermediate
        int mid = (begin+end)/2;
        int index = -1;
        while(true){
            //check element of mid is whether what you search for or not
            //最小二分法分到最后两个数相等或者起始大于结束说明没有这个target！非常重要这一点！
            if(begin>=end){
                index = -1;
                return index;
            }
            if(elements[mid]==target){
                index = mid;
                return index;
            }else{
                if(elements[mid]>target){
                    end = mid-1;
                }
                if(elements[mid]<target){
                    begin = mid+1;
                }
                mid = (begin+end)/2;
            }
        }
    }
}
