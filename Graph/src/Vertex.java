import java.util.List;

public class Vertex<T>
{
    T data;
    boolean visited;
    List<Vertex> neighbourNodes;

    Vertex(T c) {
        this.data = c;

    }

    public void setData(T data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourNodes(List<Vertex> neighbourNodes) {
        this.neighbourNodes = neighbourNodes;
    }

}
