package hw8_21000703_phanvanthanh.execrise2;

import hw8_21000703_phanvanthanh.Graph;

public class WeightedAdjacencyMatrixGraph implements Graph {
    private int[][] weightMatrix;
    private int numVertices;

    public WeightedAdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        this.weightMatrix = new int[numVertices][numVertices];
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
                if (weightMatrix[i][j] != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        return weightMatrix[u][v] != 0;
    }

    @Override
    public int getEdgeWeight(int u, int v) {
        return weightMatrix[u][v];
    }

    @Override
    public void addVertex() {
        numVertices++;
        int[][] newMatrix = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices - 1; i++) {
            System.arraycopy(weightMatrix[i], 0, newMatrix[i], 0, numVertices - 1);
        }
        weightMatrix = newMatrix;
    }

    @Override
    public void addEdge(int u, int v, int weight) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            weightMatrix[u][v] = weight;
            weightMatrix[v][u] = weight;
        }
    }

    @Override
    public void removeEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            weightMatrix[u][v] = 0;
            weightMatrix[v][u] = 0; // Assuming an undirected graph
        }
    }

    @Override
    public void removeVertex(int v) {
        if (v >= 0 && v < numVertices) {
            int[][] newMatrix = new int[numVertices - 1][numVertices - 1];
            for (int i = 0, k = 0; i < numVertices; i++) {
                if (i == v) {
                    continue;
                }
                for (int j = 0, l = 0; j < numVertices; j++) {
                    if (j == v) {
                        continue;
                    }
                    newMatrix[k][l] = weightMatrix[i][j];
                    l++;
                }
                k++;
            }
            numVertices--;
            weightMatrix = newMatrix;
        }
    }
}
