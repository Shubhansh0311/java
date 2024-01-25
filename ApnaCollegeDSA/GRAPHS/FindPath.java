package GRAPHS;

import java.util.*;

public class FindPath {

  public static class Edge {

    int wt, src, des; //src =startting vertex des=neigbouring vertex

    Edge(int wt, int src, int des) {
      this.wt = wt;
      this.src = src;
      this.des = des;
    }
  }

  //  👉👉 finding the path
  public static boolean findPath(
    ArrayList<Edge>[] graph,
    int src,
    int dest,
    boolean visited[]
  ) {
    if (src == dest) {
      return true;
    }
    visited[src] = true;

    for (int i = 0; i < graph[src].size(); i++) {
      Edge e = graph[src].get(i);
      if (!visited[e.des] && findPath(graph, e.des, dest, visited)) {
        return true;
      }
    }
    return false;
  }

  public static void createGraph(ArrayList<Edge>[] edges, int V) {
    for (int i = 0; i < V; i++) {
      edges[i] = new ArrayList<>();
    }
    // adding the first vertes
    edges[0].add(new Edge(5, 0, 1));
    // /adding the second vertex
    edges[1].add(new Edge(1, 1, 2));
    edges[1].add(new Edge(1, 1, 3));
    // /adding the third vertex
    edges[2].add(new Edge(1, 2, 3));
    edges[2].add(new Edge(1, 2, 1));
    edges[2].add(new Edge(1, 2, 4));
    // /adding the fourth vertex
    edges[3].add(new Edge(1, 4, 3));
    edges[4].add(new Edge(1, 4, 5));
  }

  public static void main(String[] args) {
    // here we are using the array list of array to store the edges data
    int V = 6; //v=no of vertex

    ArrayList<Edge>[] edges = new ArrayList[V]; //here the array list is null
    // to initilise the array list
    boolean visited[] = new boolean[edges.length];
    createGraph(edges, V);

    System.out.print(findPath(edges, 0, 50, visited));
  }
}
