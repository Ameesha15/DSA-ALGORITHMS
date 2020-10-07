public class TestSearch {
    public static void main(String[] args) {
        //target array
//        int[] arr = new int[]{2,3,5,6,8,4,9,0};
//        //target element
//        int target = 10;
//        //the index of the target element
//        int index = -1;
//        //search for the whole array
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]==target){
//                index= i;
//                break;
//            }
//        }
//        //print out the index of array
//        System.out.println("index: "+index);
        MyArray ma = new MyArray();
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(4);
        ma.add(5);
        System.out.println("index: "+ma.search(5));
    }
}
