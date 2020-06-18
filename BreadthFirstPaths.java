import java.util.*;
public class BreadthFirstPaths {
		private boolean[] marked;
		private int[] edgeTo;
		private int[] distTo;
		
		BreadthFirstPaths(Graph G, int s){
			marked = new boolean[G.V()];
			edgeTo = new int[G.V()-1];
			distTo = new int[G.V()-1];
			bfs(G,s);
		}
		
		private void bfs(Graph G, int s) {
			Queue<Integer> q = new LinkedList<>();
			q.add(s);
			marked[s] =true;
			distTo[s] = 0;

			while(!q.isEmpty()) {
				int v = q.remove();
				for(int w:G.adj(v)) {
					if(!marked[w]) {
						q.add(w);
						marked[w]=true;
						edgeTo[w] = v;
						distTo[w] = distTo[v] +1;
					}
				}
			}
		}
		
}
