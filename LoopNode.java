public class LoopNode {
    int data;
    LoopNode next=this;
    public LoopNode(int data){
        this.data = data;
    }
    public LoopNode next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node){
        LoopNode nextNext = next;
        this.next = node;
        node.next=nextNext;
    }

    public void removeNext(){
        //取出下下节点
        LoopNode newNext = next.next;
        this.next=newNext;
    }
}
