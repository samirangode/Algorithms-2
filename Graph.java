import java.util.*;
import java.io.*;

public class Graph {
	
	private final int V;
	private int E;
	private Set<Integer>[] adj; 
	
	Graph(int V){
		this.V = V;
		adj = (HashSet<Integer>[])new HashSet[V];
		for(int v=0; v<V;v++) {
			adj[v] = new HashSet();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	Iterable<Integer> adj(int v){
		return adj[v];
	}
	
	int V() {
		return V;
	}
	
	int E() {
		return E;
	}
}
