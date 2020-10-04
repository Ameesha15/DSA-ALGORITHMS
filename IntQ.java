public class IntQ {
    private int [] q;
    private int size;
    private int total;
    private int front;
    private int rear;

    public IntQ(){
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        q = new int[size];
    }
    public IntQ(int size){
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        q = new int[size];
    }

    public boolean enqueue(int item){
        if(isFull()){
            return false;
        }
        else{
            total++;
            q[rear] = item;
            //rear++; there is a problem!!
            rear = (rear + 1)%size;//in order to back to
            return true;
        }
    }


    public int dequeue(){
        int item = q[front];
        total--;
        //front ++; there is a problem too
        front = (front+1)%size;
        return item;
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }
        else{
            return false;
        }
    }
    public void showAll(){
        int f = front;
        if(total!= 0){
            for(int i = 0;i<total;i++){
                System.out.println(""+q[f]);
                f=(f+1)%size;
            }
        }
    }
}

