import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created @ 2017-9-11.
 * Auther chenfan
 */

class Link{
    class Node02{
        private String data;
        private Node02 next;
        public Node02(String data){
            this.data = data;
        }
        public void add(Node02 newNode){
            if(this.next == null){
                this.next = newNode;
            }
            else {
                this.next.add(newNode);
            }
        }
        public void print(){
            System.out.println(this.data);
            if(this.next != null){
                this.next.print();
            }
        }
    }
    private Node02 root;
    public void addNode(String data){
        Node02 newNode = new Node02(data);
        if(this.root == null)
            this.root = newNode;
        else
            this.root.add(newNode);
    }
    public void printNode(){
        if(this.root != null){
            this.root.print();
        }
    }


}

public class LinkDemo02 {

    public static void main(String args[]) {
        Link l = new Link();
        l.addNode("a");
        l.addNode("b");
        l.addNode("c");
        l.addNode("d");
        l.addNode("e");
        l.printNode();
    }
}
