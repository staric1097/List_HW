package Task;

public class Node {
    private String date;
    private Node next;
    private Node prev;

    public Node(String date) {
        this.date = date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev){
        this.prev=prev;
    }

    public String getDate() {
        return date;
    }

    public Node getNext() {
        return next;
    }
    public Node getPrev(){
        return prev;
    }
}
