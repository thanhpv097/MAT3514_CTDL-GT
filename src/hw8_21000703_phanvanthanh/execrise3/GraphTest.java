package hw8_21000703_phanvanthanh.execrise3;

import hw8_21000703_phanvanthanh.Graph;
import hw8_21000703_phanvanthanh.execrise1.UnweightedAdjacencyMatrixGraph;
import hw8_21000703_phanvanthanh.execrise2.WeightedAdjacencyMatrixGraph;

public class GraphTest {
    public static void main(String[] args) {
        testUnweightedGraph();
        testWeightedGraph();
    }

    private static void testUnweightedGraph() {
        System.out.println("Testing Unweighted Graph:");

        Graph unweightedGraph = new UnweightedAdjacencyMatrixGraph(5);

        unweightedGraph.addVertex();
        unweightedGraph.addVertex();

        unweightedGraph.addEdge(0, 1, 1);
        unweightedGraph.addEdge(1, 2, 1);

        System.out.println("Number of Vertices: " + unweightedGraph.numVertices());
        System.out.println("Number of Edges: " + unweightedGraph.numEdges());

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < unweightedGraph.numVertices(); i++) {
            for (int j = 0; j < unweightedGraph.numVertices(); j++) {
                System.out.print(unweightedGraph.hasEdge(i, j) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    private static void testWeightedGraph() {
        System.out.println("\nTesting Weighted Graph:");

        Graph weightedGraph = new WeightedAdjacencyMatrixGraph(4);

        weightedGraph.addVertex();
        weightedGraph.addVertex();

        weightedGraph.addEdge(0, 1, 3);
        weightedGraph.addEdge(1, 2, 5);

        System.out.println("Number of Vertices: " + weightedGraph.numVertices());
        System.out.println("Number of Edges: " + weightedGraph.numEdges());

        System.out.println("Edge Weights:");
        for (int i = 0; i < weightedGraph.numVertices(); i++) {
            for (int j = 0; j < weightedGraph.numVertices(); j++) {
                if (weightedGraph.hasEdge(i, j)) {
                    System.out.println("Weight from " + i + " to " + j + ": " + weightedGraph.getEdgeWeight(i, j));
                }
            }
        }
    }
}
