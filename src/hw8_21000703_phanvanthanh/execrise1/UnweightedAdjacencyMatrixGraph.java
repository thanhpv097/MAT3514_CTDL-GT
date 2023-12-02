package hw8_21000703_phanvanthanh.execrise1;

import hw8_21000703_phanvanthanh.Graph;

public class UnweightedAdjacencyMatrixGraph implements Graph {
    private boolean[][] adjacencyMatrix;
    private int numVertices;

    public UnweightedAdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new boolean[numVertices][numVertices];
    }

    @Override
    public int numVertices() {
        return numVertices;
    }

    @Override
    public int numEdges() {
        int count = 0;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        return adjacencyMatrix[u][v];
    }

    @Override
    public int getEdgeWeight(int u, int v) {
        // For an unweighted graph, you can return 0 or any default value
        return 0;
    }

    @Override
    public void addVertex() {
        numVertices++;
        boolean[][] newMatrix = new boolean[numVertices][numVertices];
        for (int i = 0; i < numVertices - 1; i++) {
            System.arraycopy(adjacencyMatrix[i], 0, newMatrix[i], 0, numVertices - 1);
        }
        adjacencyMatrix = newMatrix;
    }

    @Override
    public void addEdge(int u, int v, int weight) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            adjacencyMatrix[u][v] = true;
            adjacencyMatrix[v][u] = true;
        }
    }

    @Override
    public void removeEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            adjacencyMatrix[u][v] = false;
            adjacencyMatrix[v][u] = false;
        }
    }

    @Override
    public void removeVertex(int v) {
        if (v >= 0 && v < numVertices) {
            boolean[][] newMatrix = new boolean[numVertices - 1][numVertices - 1];
            for (int i = 0, k = 0; i < numVertices; i++) {
                if (i == v) {
                    continue;
                }
                for (int j = 0, l = 0; j < numVertices; j++) {
                    if (j == v) {
                        continue;
                    }
                    newMatrix[k][l] = adjacencyMatrix[i][j];
                    l++;
                }
                k++;
            }
            numVertices--;
            adjacencyMatrix = newMatrix;
        }
    }
}
