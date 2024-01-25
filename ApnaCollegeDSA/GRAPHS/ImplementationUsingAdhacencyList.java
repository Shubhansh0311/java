package GRAPHS;

import java.util.*;

public class ImplementationUsingAdhacencyList {

  public static class Edge {

    int wt, src, des; //src =startting vertex des=neigbouring vertex

    Edge(int wt, int src, int des) {
      this.wt = wt;
      this.src = src;
      this.des = des;
    }
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
    edges[2].add(new Edge(1, 2, 4));
    // /adding the fourth vertex
    edges[3].add(new Edge(1, 3, 2));
    edges[3].add(new Edge(1, 3, 4));
  }

  public static void main(String[] args) {
    // here we are using the array list of array to store the edges data
    int V = 5; //v=no of vertex

    ArrayList<Edge>[] edges = new ArrayList[V]; //here the array list is null
    // to initilise the array list

    createGraph(edges, V);
    // find the neighbour of vertex 2
    for (int i = 0; i < edges[2].size(); i++) {
      Edge e = edges[2].get(i);
      System.out.println(e.des);
    }
  }
}
