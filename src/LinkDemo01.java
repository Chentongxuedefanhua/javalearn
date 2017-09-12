import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */

//链表
class Node{ //定义节点
    private String data; //保存数据
    private Node next; //保存下一个节点
    public Node(String data){
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}

public class LinkDemo01 {

    public static void main(String args[]) {
        Node root = new Node("root node");
        Node n1 = new Node("node 1");
        Node n2 = new Node("node 2");
        Node n3 = new Node("node 3");
        root.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        printNode(root);
    }
    public static void printNode(Node node){
        System.out.print(node.getData() + "\t");
        if(node.getNext() !=null){
            printNode(node.getNext());
        }
    }
}
