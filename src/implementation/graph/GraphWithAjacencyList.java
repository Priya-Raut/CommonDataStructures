package implementation.graph;

import java.util.ArrayList;

/**
 * A class which represents graph using adjacency list
 *
 * @author Priya Raut
 */
public class GraphWithAjacencyList {

    private static int numberOfNodes;
    private static ArrayList<ArrayList<Integer>> adjacencyList;

    /**
     * Create adjacencyList for the graph
     *
     * @param numberOfNodes
     */
    public GraphWithAjacencyList(int numberOfNodes) {
        //create outer list  
        adjacencyList = new ArrayList<>(numberOfNodes);
        //populate inner list for each item in outer list
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    /**
     * Add edge between two nodes in the graph (using adjacency list)
     *
     * @param adjacencyList
     * @param v1 a node in the graph
     * @param v2 another node in the graph
     */
    public static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int v1, int v2) {
        adjacencyList.get(v1).add(v2); //add edge between v1 and v2
        adjacencyList.get(v2).add(v1); //also add edge between v2 and v1 since this is undirectional graph
    }

    /**
     * Get total number of nodes from the graph
     *
     * @return number of nodes in the graph
     */
    public static int getNumberOfNodes() {
        return 5;
    }

    /**
     * Get adjacencyList
     *
     * @return AdjacencyList
     */
    public static ArrayList<ArrayList<Integer>> getAdjacencyList() {
        GraphWithAjacencyList graph = new GraphWithAjacencyList(5);
        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 4);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 4);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 2, 3);
        addEdge(adjacencyList, 3, 4);
        return adjacencyList;
    }

    /**
     * Print the edges between the adjacent nodes
     *
     * @param adjacencyList
     */
    public static void printEdge(ArrayList<ArrayList<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {//for outer list
            System.out.print("head");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {//for each element in the inner list
                System.out.print(" --> " + adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printEdge(getAdjacencyList());
    }
}
