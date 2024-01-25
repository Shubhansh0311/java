package GRAPHS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DjikstrasShortestPathAlgorithm {

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
    edges[0].add(new Edge(2, 0, 1));
    edges[0].add(new Edge(4, 0, 2));
    edges[1].add(new Edge(7, 1, 3));
    edges[1].add(new Edge(1, 1, 2));
    edges[2].add(new Edge(3, 2, 4));

    edges[3].add(new Edge(1, 3, 5));
    edges[4].add(new Edge(2, 4, 3));
  }

  //   ❗❗❗❗❗❗❗

  //   to compare on the basis of path
  static class Pair implements Comparable<Pair> {

    int n;
    int path;

    public Pair(int n, int path) {
      this.n = n;
      this.path = path;
    }

    public int compareTo(Pair p2) {
      return this.path - p2.path;
    }
  }

  public static void shortestPath(ArrayList<Edge>[] graph, int src) {
    int dist[] = new int[graph.length];

    boolean visited[] = new boolean[graph.length];
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    for (int i = 0; i < graph.length; i++) {
      if (i != src) {
        dist[i] = Integer.MAX_VALUE;
      }
    }
    pq.add(new Pair(src, 0));
    while (!pq.isEmpty()) {
      Pair curr = pq.remove();
      if (!visited[curr.n]) {
        visited[curr.n] = true;
        // neighbour
        for (int j = 0; j < graph[curr.n].size(); j++) {
          Edge e = graph[curr.n].get(j);
          int wt = e.wt;
          int u = e.src;
          int v = e.dest;
          if (dist[u] + wt < dist[v]) {
            dist[v] = dist[u] + wt;
            pq.add(new Pair(v, dist[v]));
          }
        }
      }
    }
    for (int i = 0; i < dist.length; i++) {
      System.out.print(dist[i] + " ");
    }
  }

  public static void main(String[] args) {
    // here we are using the array list of array to store the edges data
    int V = 6; //v=no of vertex

    ArrayList<Edge>[] graph = new ArrayList[V]; //here the array list is null
    // to initilise the array list
    createGraph(graph, V);

    shortestPath(graph, 0);
  }
}
