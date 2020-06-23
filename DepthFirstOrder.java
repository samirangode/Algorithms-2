import java.util.*;
public class DepthFirstOrder {
	private Stack<Integer> reversePostorder;
	private Queue<Integer> preorder;
	private Queue<Integer> postorder;
	private boolean[] marked; 
	
	public DepthFirstOrder(Digraph G) {
		marked = new boolean[G.V()];
		reversePostorder = new Stack<Integer>();
		preorder = new LinkedList<Integer>();
		postorder = new LinkedList<Integer>();
	}
	
	private void dfs(Digraph G, int v) {
		if(marked[v]) return;
		preorder.add(v);
		for(int w:G.adj(v)) {
			if(!marked[w]) dfs(G,w);
		}
		reversePostorder.push(v);
		postorder.add(v);
	}
	
	public Stack<Integer> reversePostorder() {
		return reversePostorder;
	}
}
