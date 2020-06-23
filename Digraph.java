import java.util.*;
public class Digraph {
	private final int V;
	private final Set<Integer>[] adj;
	
	public Digraph(int V) {
		this.V = V;
		adj = (HashSet<Integer>[])new HashSet[V];
		for(int i =0; i<V; i++) {
			adj[i] = new HashSet<Integer>();
		}
	}
	
	private Digraph(int V, Set<Integer>[] ad) {
		this.V = V; 
		this.adj = ad;
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
	
	int V() {
		return V;
	}
	
	public Digraph reverse() {
		Set<Integer>[] adj2 = (HashSet<Integer>[])new HashSet[V];
		for(int i=0; i<V;i++)
			for(int j:adj[i]){
				adj2[j].add(i);
			}
		return new Digraph(this.V, adj2);
	}
	
	
}
