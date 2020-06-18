
public class DepthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DepthFirstPaths(Graph G, int s) {
		int v = G.V();
		marked = new boolean[v];
		edgeTo = new int[v];
		//find vertices connected to s
		dfs(G,s);
	}
	
	private void dfs(Graph G, int v) {
	/*	if(marked[v]==true) return;
		if(G.adj(v)==null) return;
		marked[v] = true;
		for(int i:G.adj(v)) {
			dfs(G,i);
			edgeTo[i] = v;
		}
	*/	// alternate implementation
		marked[v] = true;
		for(int w: G.adj(v))
			if(!marked[w]) {
				dfs(G,w);
				edgeTo[w] =v;
			}
	
	}
	
}