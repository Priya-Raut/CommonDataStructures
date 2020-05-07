/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;

/**
 * A class which represents graph using adjacency list
 * 
 * @author piya
 */
public class GraphWithAjacencyList {
    /*
     Data structures we are gonna need:
     1. Array to store visited nodes
     2. Queue to keep track of order of neighbouring nodes as we visit them
     3. Adjacency list to store adjacent nodes a nodes
    
     Operations:
     1. Add edge
     2. Print edge
    */
    
    int numberOfNodes;
    ArrayList<ArrayList<Integer>> adjacencyList;
    
    /**
     * Create adjacencyList for the graph
     * 
     * @param numberOfNodes 
     */
    public GraphWithAjacencyList(int numberOfNodes) {
      this.numberOfNodes = numberOfNodes;
      //create outer list  
      this.adjacencyList = new ArrayList<>(numberOfNodes);
      //populate inner list for each item in outer list
      for (int i=0; i<numberOfNodes; i++) {
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
    public void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int v1, int v2){
        adjacencyList.get(v1).add(v2); //add edge between v1 and v2
        adjacencyList.get(v2).add(v1); //also add edge between v2 and v1 since this is undirectional graph
    }
    
    /**
     * Print the edges between the adjacent nodes
     * 
     * @param adjacencyList 
     */
    public void printEdge(ArrayList<ArrayList<Integer>> adjacencyList){
        for(int i=0; i<adjacencyList.size(); i++){//for outer list
            System.out.print("head");
            for(int j=0; j<adjacencyList.get(i).size(); j++){//for each element in the inner list
                System.out.print(" --> " + adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        GraphWithAjacencyList graph = new GraphWithAjacencyList(5);
        graph.addEdge(graph.adjacencyList, 0, 1);
        graph.addEdge(graph.adjacencyList, 0, 4);
        graph.addEdge(graph.adjacencyList, 1, 2);
        graph.addEdge(graph.adjacencyList, 1, 4);
        graph.addEdge(graph.adjacencyList, 1, 3);
        graph.addEdge(graph.adjacencyList, 2, 3);
        graph.addEdge(graph.adjacencyList, 3, 4);
        graph.printEdge(graph.adjacencyList);
    }
}
