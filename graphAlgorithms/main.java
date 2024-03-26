package graphAlgorithms;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // Graph

        /*
         * ArrayList<graphNode> nodeList=new ArrayList<graphNode>();
         * nodeList.add(new graphNode("A", 0));
         * nodeList.add(new graphNode("B", 1));
         * nodeList.add(new graphNode("C",2));
         * nodeList.add(new graphNode("D", 3));
         * nodeList.add(new graphNode("E", 4));
         * nodeList.add(new graphNode("F",5));
         * nodeList.add(new graphNode("G", 6));
         * nodeList.add(new graphNode("H", 7));
         */

        // Adjacency Matrix

        /*
         * adjacencyMatrix mat=new adjacencyMatrix(nodeList);
         * mat.addDirectedEdge(0, 2);
         * mat.addDirectedEdge(1, 2);
         * mat.addDirectedEdge(1, 3);
         * mat.addDirectedEdge(2, 4);
         * mat.addDirectedEdge(3, 5);
         * mat.addDirectedEdge(4, 5);
         * mat.addDirectedEdge(4, 7);
         * mat.addDirectedEdge(5, 6);
         * System.out.println((mat.toString()));
         * //mat.bfs();
         * //mat.dfs();
         * //mat.topologicalSort();
         * mat.BFSforSSSPP(nodeList.get(0));
         */

        // Adjacency List

        /*
         * adjacencyList lst=new adjacencyList(nodeList);
         * lst.addDirectedEdge(0, 2);
         * lst.addDirectedEdge(1, 2);
         * lst.addDirectedEdge(1, 3);
         * lst.addDirectedEdge(2, 4);
         * lst.addDirectedEdge(3, 5);
         * lst.addDirectedEdge(4, 5);
         * lst.addDirectedEdge(4, 7);
         * lst.addDirectedEdge(5, 6);
         * System.out.println((lst.toString()));
         * //lst.bfs();
         * //lst.dfs();
         * //lst.topologicalSort();
         */

        // Dijkstra's Algorithm

        /*
         * ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
         * nodeList.add(new weightedNode("A", 0));
         * nodeList.add(new weightedNode("B", 1));
         * nodeList.add(new weightedNode("C",2));
         * nodeList.add(new weightedNode("D", 3));
         * nodeList.add(new weightedNode("E", 4));
         * nodeList.add(new weightedNode("F",5));
         * nodeList.add(new weightedNode("G", 6));
         * weightedGraph graph=new weightedGraph(nodeList);
         * graph.addWeightedEdge(0, 1, 2);
         * graph.addWeightedEdge(0, 2, 5);
         * graph.addWeightedEdge(1, 2, 6);
         * graph.addWeightedEdge(1, 3, 1);
         * graph.addWeightedEdge(1, 4, 3);
         * graph.addWeightedEdge(2, 5, 8);
         * graph.addWeightedEdge(2, 4, 4);
         * graph.addWeightedEdge(4, 6, 9);
         * graph.addWeightedEdge(5, 6, 7);
         * System.out.println("Printing Dijsktra from source : A");
         * graph.dijkstra(nodeList.get(0));
         */

        // Bellman Ford's Algorithm

        /*
         * ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
         * nodeList.add(new weightedNode("A", 0));
         * nodeList.add(new weightedNode("B", 1));
         * nodeList.add(new weightedNode("C",2));
         * nodeList.add(new weightedNode("D", 3));
         * nodeList.add(new weightedNode("E", 4));
         * nodeList.add(new weightedNode("F",5));
         * nodeList.add(new weightedNode("G", 6));
         * weightedGraph graph=new weightedGraph(nodeList);
         * graph.addWeightedEdge(0, 1, 2);
         * graph.addWeightedEdge(0, 2, 5);
         * graph.addWeightedEdge(1, 2, 6);
         * graph.addWeightedEdge(1, 3, 1);
         * graph.addWeightedEdge(1, 4, 3);
         * graph.addWeightedEdge(2, 5, 8);
         * graph.addWeightedEdge(2, 4, 4);
         * graph.addWeightedEdge(4, 6, 9);
         * graph.addWeightedEdge(5, 6, 7);
         * System.out.println("Printing Bellman Ford from source : A");
         * graph.bellmanFord(nodeList.get(0));
         */

        // Floyd Warshall's Algorithm

        /*
         * ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
         * nodeList.add(new weightedNode("A", 0));
         * nodeList.add(new weightedNode("B", 1));
         * nodeList.add(new weightedNode("C",2));
         * nodeList.add(new weightedNode("D", 3));
         * weightedGraph graph=new weightedGraph(nodeList);
         * graph.addWeightedEdge(0, 3, 1);
         * graph.addWeightedEdge(0, 1, 8);
         * graph.addWeightedEdge(1, 2, 1);
         * graph.addWeightedEdge(2, 0, 4);
         * graph.addWeightedEdge(3, 1, 2);
         * graph.addWeightedEdge(3, 2, 9);
         * System.out.println("Printing Floyd Warshall");
         * graph.floydWarshall();
         */

        // Kruskal's Algorithm

        /*
         * ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
         * nodeList.add(new weightedNode("A"));
         * nodeList.add(new weightedNode("B"));
         * nodeList.add(new weightedNode("C"));
         * nodeList.add(new weightedNode("D"));
         * nodeList.add(new weightedNode("E"));
         * kruskal graph=new kruskal(nodeList);
         * graph.addWeightedUndirectedEdge(0, 1, 5);
         * graph.addWeightedUndirectedEdge(0, 2, 13);
         * graph.addWeightedUndirectedEdge(0, 4, 15);
         * graph.addWeightedUndirectedEdge(1, 2, 10);
         * graph.addWeightedUndirectedEdge(1, 3, 8);
         * graph.addWeightedUndirectedEdge(2, 3, 6);
         * graph.addWeightedUndirectedEdge(2, 4, 20);
         * System.out.println("Running Kruskal Algo on the graph:");
         * graph.Kruskal();
         */

        // Prim's Algorithm

        /*
         * ArrayList<weightedNode> nodeList=new ArrayList<weightedNode>();
         * nodeList.add(new weightedNode("A"));
         * nodeList.add(new weightedNode("B"));
         * nodeList.add(new weightedNode("C"));
         * nodeList.add(new weightedNode("D"));
         * nodeList.add(new weightedNode("E"));
         * prims graph=new prims(nodeList);
         * graph.addWeightedUndirectedEdge(0, 1, 5);
         * graph.addWeightedUndirectedEdge(0, 2, 13);
         * graph.addWeightedUndirectedEdge(0, 4, 15);
         * graph.addWeightedUndirectedEdge(1, 2, 10);
         * graph.addWeightedUndirectedEdge(1, 3, 8);
         * graph.addWeightedUndirectedEdge(2, 3, 6);
         * graph.addWeightedUndirectedEdge(2, 4, 20);
         * System.out.println("Running Prims Algo on the graph:");
         * graph.prim(nodeList.get(4));
         */
    }

}
