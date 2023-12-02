package hw8_21000703_phanvanthanh;
public interface Graph {
    int numVertices();
    int numEdges();
    boolean hasEdge(int u, int v);
    int getEdgeWeight(int u, int v);
    void addVertex();
    void addEdge(int u, int v, int weight);
    void removeEdge(int u, int v);
    void removeVertex(int v);
}