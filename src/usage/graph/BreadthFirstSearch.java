package usage.graph;

import java.util.ArrayDeque;
import java.util.Queue;
import implementation.graph.GraphWithAjacencyList;
import java.util.ArrayList;

/**
 * A class which implements Breath Fist Search for a graph.
 *
 * Algorithm: 1. Put start node into the queue 2. Mark the start node as visited
 * 3. Check of the queue is empty or not, before popping the start node 4. Put
 * the current node's adjacent nodes into queue
 *
 * @author Priya Raut
 */
public class BreadthFirstSearch {

    int[] visitedArray;
    Queue<Integer> orderQueue;

    public BreadthFirstSearch(int numberOfNodes) {
        this.visitedArray = new int[numberOfNodes];
        this.orderQueue = new ArrayDeque<>();
    }

    public void searchBreadthFirst(int startNode) {
        ArrayList<ArrayList<Integer>> adjacencyList = GraphWithAjacencyList.getAdjacencyList();

        visitedArray[startNode] = 1; //node 0 is marked as visited
        orderQueue.offer(startNode);

        while (!orderQueue.isEmpty()) {
            int currentNode = orderQueue.remove();
            System.out.print(currentNode + " ");

            for (int i = 0; i < adjacencyList.get(currentNode).size(); i++) {
                int nextNode = adjacencyList.get(currentNode).get(i);
                if (visitedArray[nextNode] != 1) { //put into the queue only if it is not yet visited
                    visitedArray[nextNode] = 1; //node is marked as visited
                    orderQueue.offer(nextNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch object = new BreadthFirstSearch(GraphWithAjacencyList.getNumberOfNodes());
        object.searchBreadthFirst(0); //starting BFS from node 0
    }

}
