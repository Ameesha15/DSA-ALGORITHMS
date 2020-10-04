public class Test {
    public static void main(String[] args) {
        //System.out.println(fabonacci(7));
        hanoi(3,'A','B','C');
    }
    public static int fabonacci(int i){
        if(i==1||i==2){
            return 1;
        }
        else {
            return fabonacci(i-1)+fabonacci(i-2);
        }
    }
    /*
    @param n n个盘子
    @param from 开始的柱子
    @param in 中间的柱子
    @param to 目标柱子
    无论有多少个盘子，都认为只有两个，上面的所有盘子喝最下面的一个盘子
    */

    public static void hanoi(int n,char from, char in, char to){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
            //无论有多少个盘子，都认为只有两个，上面的所有盘子喝最下面的一个盘子
        }
        else{
            //移动上面的所有盘子
            hanoi(n-1,from,to,in);
            ///移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移动"+to);
            //把上面的所有盘子从中间位置移到目标位置
            hanoi(n-1,in,from,to);
        }
    }

}
