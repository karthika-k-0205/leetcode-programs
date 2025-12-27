
class CompleteGraphMatrix {

    private final int V;
    private final int[][] adjMatrix;

    CompleteGraphMatrix(int vertices) {
        V = vertices;
        adjMatrix = new int[V][V];
        createCompleteGraph();
    }

    void createCompleteGraph() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i != j) {
                    adjMatrix[i][j] = 1; 
                }
            }
        }
    }

    void displayVertices() {
        System.out.print("Vertices: ");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

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

    public static void main(String[] args) {
        CompleteGraphMatrix graph = new CompleteGraphMatrix(4);

        graph.displayVertices();
        graph.displayAdjacencyMatrix();
    }
}
