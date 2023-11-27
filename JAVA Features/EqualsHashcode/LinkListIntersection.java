package EqualsHashcode;

import java.util.HashSet;
import java.util.Set;

public class LinkListIntersection
{
    public static void main (String[] args)
    {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);


        Node node6 = new Node(7, null);
        Node node7 = new Node(2, null);
        Node node8 = new Node(9, null);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node4);

        LinkListIntersection linkListIntersection = new LinkListIntersection();
        System.out.println("Intersecting node is " +  linkListIntersection.findPoint(node1, node6).getData());
    }

    public Node findPoint(Node head1, Node head2) {

        //First Way using Set
        Set<Node> nodeSet = new HashSet<>();

        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null) {
            nodeSet.add(temp1);
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            if(nodeSet.contains(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }
}
