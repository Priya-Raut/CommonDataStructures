/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usage.graph;

import implementation.graph.GraphWithAjacencyList;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author piya
 */
public class DeapthFirstSearch {

    ArrayList<ArrayList<Integer>> list = GraphWithAjacencyList.getAdjacencyList();

    public void searchDeapthFirst(int startNode, int[] visited) {
//        System.out.println("startNode: " + startNode);
//        System.out.println("visited array: " + Arrays.toString(visited));
        visited[startNode] = 1;
        System.out.print(startNode + " " );
        Iterator<Integer> itr = list.get(startNode).iterator();
        while (itr.hasNext()) {
            int nextNode = itr.next();
            if (visited[nextNode] != 1) {
                searchDeapthFirst(nextNode, visited);
            }
        }
    }

    public static void main(String[] args) {
        DeapthFirstSearch object = new DeapthFirstSearch();
        int[] visited = new int[GraphWithAjacencyList.getNumberOfNodes()];
        object.searchDeapthFirst(0, visited);
    }
}
