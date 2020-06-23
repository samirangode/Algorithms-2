
public class Edge implements Comparable<Edge> {
	
	private final int v,w;
	private final double weight;
	
	public Edge(int v, int w, double weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int either() {
		return v;
	}
	
	public int other(int vertex) {
		if(vertex == v) return w;
		else if (vertex == w) return v;
		return -1;
	}
	
	public int compareTo(Edge e){
		if(this.weight < e.weight()) return -1;
		else if(this.weight > e.weight()) return 1;
		else return 0;
	}

	public double weight() {
		return weight;
	}
}
