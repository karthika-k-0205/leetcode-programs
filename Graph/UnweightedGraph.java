import java.util.*;

class UnweightedGraph {

    private final int V;                
    private final List<List<Integer>> adjList;

    UnweightedGraph(int vertices) {
        V = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }
    void display() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UnweightedGraph graph = new UnweightedGraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.display();
    }
}
