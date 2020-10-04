public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node append(Node node){
        Node currentNode = this;
        while(currentNode.next()!=null){
            currentNode = currentNode.next();
        }
        currentNode.next = node;
        return this;
    }
    public Node next(){
        return this.next;
    }
    public int getData(){
        return this.data;
    }
    //当前节点是否为最后一个节点；
    public boolean isLast(){
        return next==null;
    }
    //插入一个节点作为当前节点的下一个节点
    public void after(Node node){
        Node nextNext = next;
        this.next = node;
        node.next=nextNext;
    }




    public void removeNext(){
        //取出下下节点
        Node newNext = next.next;
        this.next=newNext;
    }
    public void show(){
        Node currentNode = this;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
}


