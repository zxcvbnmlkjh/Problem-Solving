import java.util.ArrayList;
import java.util.List;

public class Graph_List_Representation
{
    public static void main(String[] args) {
        Graph_List_Representation list_representation = new Graph_List_Representation();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        list_representation.printList(list);
        list_representation.addEdge(list, 0, 1);
        list_representation.addEdge(list, 1, 2);
        list_representation.addEdge(list, 2, 3);
        list_representation.addEdge(list, 3, 4);
        list_representation.addEdge(list, 0, 4);
        list_representation.addEdge(list, 4, 1);
        list_representation.addEdge(list, 1, 3);
        list_representation.printList(list);
    }

    void addEdge (List<List<Integer>> list, int i , int j) {
            list.get(i).add(j);
            list.get(j).add(i);
    }

    void printList (List<List<Integer>> list)
    {
        for (List<Integer> listElem : list) {

            for (int l : listElem) {
                System.out.print(l + " ");
            }
            System.out.print("\n");
        }

    }
}
