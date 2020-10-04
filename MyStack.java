public class MyStack {
    //栈的底层我们使用数组存放数据
    int[] elements;
    public MyStack(){
        elements = new int[0];
    }
    public void push(int element){
        int [] newArr = new int[elements.length+1];
        for(int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }
    //取出栈顶元素
    public int pop(){
        //取出数组的最后一个元素
        //栈中没有元素的判定
        if(elements.length==0){
            throw new RuntimeException("Stack is empty");
        }
        int element = elements[elements.length-1];
        int[] newArr = new int[elements.length-1];
        for(int i =0;i<newArr.length;i++){
            newArr[i]=elements[i];
        }
        elements=newArr;
        return element;
    }
    public int peek(){
        if(elements.length==0){
            throw new RuntimeException("Stack is empty");
        }
        return elements[elements.length-1];
    }
    public boolean isEmpty(){
        return (elements.length==0);
    }
}
