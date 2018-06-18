package binary_tree;

public class Tree {
	
	public Node root;
	
	public Tree() {
		this.root = null;
	}
	
	
	public void insert(String value, String data) {
		Node newNode = new Node(value, data);
		
		if (this.root == null) {
			this.root = newNode;
		} 
		
		this.root.insert(value, data);
		return;
	}
	
	public String search(Node root, String value) {
		if (this.root == null) {
			return "The Tree is Empty";
		}
		
		String foundData = this.root.search(this.root, value);
		
		return foundData == null ? "Value Not in Tree" : foundData;
	}
}
