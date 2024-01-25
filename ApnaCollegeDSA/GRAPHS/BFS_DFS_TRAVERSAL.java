package GRAPHS;

import java.util.*;

public class BFS_DFS_TRAVERSAL {

  // 👉BFS TRAVERSAL
  public static void BFS(ArrayList<Edge>[] graph) {
    boolean visited[] = new boolean[graph.length];
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while (!q.isEmpty()) {
      int curr = q.remove();
      if (!visited[curr]) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.des);
        }
      }
    }
  }

  // 👉👉DFS TRAVERSAL

  public static void DFS(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
    System.out.println(curr);
    // marking visited of curr true
    visited[curr] = true;
    // printing neighbours
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!visited[e.des]) {
        DFS(graph, e.des, visited);
      }
    }
  }

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
    edges[2].add(new Edge(1, 2, 1));
    edges[2].add(new Edge(1, 2, 4));
    // /adding the fourth vertex
    edges[3].add(new Edge(1, 4, 3));
    edges[3].add(new Edge(1, 4, 1));
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

    System.out.println("BFS traversal");
    BFS(edges);
    boolean visited[] = new boolean[edges.length];

    System.out.println("DFS traversal");
    DFS(edges, 0, visited);
  }
}
