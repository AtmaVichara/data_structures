package binary_tree;

public class Node {
	
	public String value;
	public String data;
	public Node left;
	public Node right;
	
	public Node(String value, String data) {
		this.value = value;
		this.data = data;
	}
	
	public void insert(String value, String data) {	
		if (value.compareTo(this.value) < 0) {
			if (this.left == null) {
				this.left = new Node(value, data);
			} else {
				this.left.insert(value, data);
			}
		} else if (value.compareTo(this.value) > 0) {
			if (this.right == null) {
				this.right = new Node(value, data);
			} else {
				this.right.insert(value, data);
			}
		}
	}
	
	public String search(Node root, String value) {
		if (value.equals(root.value)){
			return root.data;
		} else if (value.compareTo(root.value) < 0) {
			return root.left == null ? null : search(root.left, value);
		} else {
			return root.right == null ? null : search(root.right, value);
		}
	}	
}
