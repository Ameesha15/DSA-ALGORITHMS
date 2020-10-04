public class TestBinarySearch {
    public static void main(String[] args) {
        //target array(arranged)
//        int [] arr = new int []{1,2,3,4,5,6,7,8,9};
//        //target element
//        int target = 0;
//        //begin
//        int begin = 0;
//        //end
//        int end = arr.length-1;
//        //intermediate
//        int mid = (begin+end)/2;
//        int index;
//        while(true){
//            //check element of mid is whether what you search for or not
//         
//            if(begin>=end){
//                index = -1;
//                break;
//            }
//            if(arr[mid]==target){
//                index = mid;
//                break;
//            }else{
//                if(arr[mid]>target){
//                    end = mid-1;
//                }
//                if(arr[mid]<target){
//                    begin = mid+1;
//                }
//                mid = (begin+end)/2;
//            }
//        }
//        System.out.println("index: "+index);
        MyArray ma = new MyArray();
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);
        ma.add(6);
        ma.add(7);
        System.out.println(ma.binarySearch(98));
    }
}
