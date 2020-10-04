public class DoubleNode {
    DoubleNode prev = this;
    DoubleNode next = this;
    int data;
    public DoubleNode(int data){
        this.data = data;
    }
    //增加节点
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext = next;
        //把新节点作为当前节点的前一个节点
        this.next = node;
        //把当前节点做新节点的下一个节点
        node.prev = this;
        //让原来的下一个节点做新节点的下一个节点
        node.next = nextNext;
        //让原来的下一个节点的上一个节点做新节点
        nextNext.prev = node;
    }
    //下一个节点
    public DoubleNode next(){
        return this.next;
    }
    public DoubleNode prev(){
        return this.prev;
    }
    public int getData(){
        return data;
    }
}
