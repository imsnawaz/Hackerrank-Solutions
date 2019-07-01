

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        n.next = null;
        if(head == null)
            head = n;
        else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = n;
        }
        return head;
    }


