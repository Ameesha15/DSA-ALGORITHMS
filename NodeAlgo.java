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

    public boolean isLast(){
        return next==null;
    }

    public void after(Node node){
        Node nextNext = next;
        this.next = node;
        node.next=nextNext;
    }




    public void removeNext(){

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


