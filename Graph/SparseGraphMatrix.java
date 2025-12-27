
class SparseGraphMatrix {

    private final int V;
    private final int[][] adjMatrix;

    // Constructor
    SparseGraphMatrix(int vertices) {
        V = vertices;
        adjMatrix = new int[V][V];
    }

    // Add edge (Directed)
    void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
    }

    // Display vertices
    void displayVertices() {
        System.out.print("Vertices: ");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Display adjacency matrix
    void displayAdjacencyMatrix() {
        System.out.println("\nAdjacency Matrix:");
        System.out.print("   ");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        SparseGraphMatrix graph = new SparseGraphMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        graph.displayVertices();
        graph.displayAdjacencyMatrix();
    }
}
