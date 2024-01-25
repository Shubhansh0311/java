package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintALLpath {

  public static class Edge {

    int wt, src, dest; //src =startting vertex des=neigbouring vertex

    Edge(int wt, int src, int dest) {
      this.wt = wt;
      this.src = src;
      this.dest = dest;
    }
  }

  public static void createGraph(ArrayList<Edge>[] edges, int V) {
    for (int i = 0; i < V; i++) {
      edges[i] = new ArrayList<>();
    }
    // adding the first vertes
    edges[0].add(new Edge(5, 0, 3));
    edges[2].add(new Edge(5, 2, 3));
    edges[3].add(new Edge(5, 3, 1));
    edges[4].add(new Edge(5, 4, 0));
    edges[4].add(new Edge(5, 4, 1));
    edges[5].add(new Edge(5, 5, 0));
    edges[5].add(new Edge(5, 5, 2));
  }

  //   ❗❗❗❗❗❗❗
  public static void printPath(
    ArrayList<Edge>[] graph,
    int src,
    int dest,
    String path
  ) {
    if (src == dest) {
      System.out.println(path + dest);
      return;
    }

    for (int i = 0; i < graph[src].size(); i++) {
      Edge e = graph[src].get(i);
      printPath(graph, e.dest, dest, path + src);
    }
  }

  public static void main(String[] args) {
    // here we are using the array list of array to store the edges data
    int V = 6; //v=no of vertex

    ArrayList<Edge>[] graph = new ArrayList[V]; //here the array list is null
    // to initilise the array list
    createGraph(graph, V);
    String path = "";
    System.out.println("printing path ");
    printPath(graph, 5, 1, path);
  }
}
