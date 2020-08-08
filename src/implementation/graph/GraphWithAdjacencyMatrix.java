/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.graph;

/**
 * A class which represents graph using adjacency matrix
 *
 * @author piya
 */
public class GraphWithAdjacencyMatrix {

    int numberOfNodes;
    int[][] adjacencyMatrix;

    /**
     * Create adjacencyMatrix for the graph
     *
     * @param numberOfNodes
     */
    public GraphWithAdjacencyMatrix(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        this.adjacencyMatrix = new int[numberOfNodes][numberOfNodes];
    }

    /**
     * Add edge between two nodes in the graph (using adjacency matrix)
     *
     * @param adjacencyMatrix
     * @param v1 a node in the graph
     * @param v2 another node in the graph
     */
    public void addEdge(int[][] adjacencyMatrix, int v1, int v2) {
        adjacencyMatrix[v1][v2] = 1; //add edge between v1 and v2
        adjacencyMatrix[v2][v1] = 1; //also add edge between v2 and v1 since this is undirectional graph
    }

    /**
     * Print the edges between the adjacent nodes
     *
     * @param adjacencyMatrix
     */
    public void printEdge(int[][] adjacencyMatrix) {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphWithAdjacencyMatrix graph = new GraphWithAdjacencyMatrix(5);
        graph.addEdge(graph.adjacencyMatrix, 0, 1);
        graph.addEdge(graph.adjacencyMatrix, 0, 4);
        graph.addEdge(graph.adjacencyMatrix, 1, 2);
        graph.addEdge(graph.adjacencyMatrix, 1, 4);
        graph.addEdge(graph.adjacencyMatrix, 1, 3);
        graph.addEdge(graph.adjacencyMatrix, 2, 3);
        graph.addEdge(graph.adjacencyMatrix, 3, 4);
        graph.printEdge(graph.adjacencyMatrix);
    }
}
