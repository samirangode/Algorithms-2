
public class ConnectedComponents {
	private boolean marked[];
	private int id[];
	private int count;
	
	public ConnectedComponents(Graph G) {
		marked = new boolean[G.V()];
		id = new int[G.V()];
		for(int v =0; v<G.V(); v++) {
			if(!marked[v]) {	
				dfs(G, v);
				count++;
			}
		}
	}
	
	public int count() {
		return count;
	}
	private void dfs(Graph G, int v) {
		if(marked[v]) return;
		marked[v] = true;
		id[v] = count;
		for(int i:G.adj(v)) {
			if (!marked[v]) dfs(G,i);
		}
	}
	
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}
	public int id(int v) {
		return id[v];
	}
}
