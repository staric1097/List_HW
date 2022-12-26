package Task;

public class MyList2Linked {
    private Node head;
    private Node tail;
    private int ListSize=0;

    public void add_OrderBy_len_al(String date){
        Node added=new Node(date);
        ListSize++;
        if (head==null){
            head=tail=added;
            head.setNext(tail);
            head.setPrev(tail);
        } else {
            Node prevTail=tail;
            tail=added;
            prevTail.setNext(added);
            head.setPrev(added);
            tail.setNext(head);
            tail.setPrev(prevTail);
        }
        sort();
    }

    public String Get(int index){
        if(index<0 || index>=ListSize) throw new RuntimeException("out of range Exc");
        Node current=head;
        for(int i=0; i<index; i++){
            current=current.getNext();
        }
        return current.getDate();
    }

    public Node GetNode(int index){
        if(index<0 || index>=ListSize) throw new RuntimeException("out of range Exc");
        Node current=head;
        for(int i=0; i<index; i++){
            current=current.getNext();
        }
        return current;
    }

    private void sort(){
        for (int i=0; i<ListSize-1; i++){
            for (int j=0; j<ListSize-1-i; j++){
                if(Get(j).length()>Get(j+1).length()){
                    Swap(GetNode(j), GetNode(j+1));
                } else if (Get(j).length()==Get(j+1).length()) {
                    if (Get(j).charAt(0)>Get(j+1).charAt(0)){
                        Swap(GetNode(j), GetNode(j+1));
                    }
                }
            }
        }
    }

    private void Swap(Node node1, Node node2){
        String temp=node1.getDate();
        node1.setDate(node2.getDate());
        node2.setDate(temp);
    }

    @Override
    public String toString(){
        String result="";
        Node current=head;
        do {
            result+=current.getDate()+"; ";
            current=current.getNext();
        } while (current!=head);
        return result;
    }
}
