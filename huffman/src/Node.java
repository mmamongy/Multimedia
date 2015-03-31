
public class Node {
	public String sym; 
	public String cod ;
	public double pro;
	public Node left = null; 
	public Node right = null ;
	Node(Node node) { 
		node = null ;
	}
	public Node () { 
		this.sym = "";
		this.cod = "";
		this.pro = 0;
		this.left = null;
		this.right = null;
	}
	public Node(String sym1, double pro, String cod , Node left, Node right) {
		this.sym = sym1;
		this.cod = cod;
		this.pro = pro;
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return "Node [sym=" + sym + ", cod=" + cod + ", pro=" + pro + ", left="
				+ left + ", right=" + right + "]";
	}
	
}
