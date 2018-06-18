package binary_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeTest {
	
	@Test
	public void instantiationOfTreeShouldHaveNullRoot() {
		Tree tree = new Tree();
		
		assertEquals(null, tree.root, "Head of tree on instantiation should be null");
	}
	
	@Test
	public void insertIntoTreeShouldInsertNewNode() {
		Tree tree = new Tree();
		tree.insert("b", "beta");
		
		assertEquals("b", tree.root.value, "Value of inserted node should be 'b'");
		assertEquals("beta", tree.root.data, "Data of inserted node should be 'beta");
		
		tree.insert("a", "alpha");
		assertEquals("a", tree.root.left.value, "Value of inserted node should be 'a'");
		assertEquals("alpha", tree.root.left.data, "Data of inserted node should be 'alpha");
		
		tree.insert("c", "charlie");
		assertEquals("c", tree.root.right.value, "Value of inserted node should be 'c'");
		assertEquals("charlie", tree.root.right.data, "Data of inserted node should be 'charlie");
	}
	
	@Test
	public void searchShouldReturnDataOfValuePassed() {
		Tree tree = new Tree();
		
		tree.insert("e", "echo");
		tree.insert("a", "alpha");
		tree.insert("c", "charlie");
		tree.insert("d", "delta");
		tree.insert("b", "beta");
		
		assertEquals("charlie", tree.search(tree.root, "c"), "Search returns 'charlie' if passed 'c'");
		assertEquals("delta", tree.search(tree.root, "d"), "Search returns 'delta' if passed 'd'");
		assertEquals("beta", tree.search(tree.root, "b"), "Search returns 'beta' if passed 'b'");
		assertEquals("Value Not in Tree", tree.search(tree.root, "z"), "Search returns 'Value Not in Tree if passed 'z'");
	}
}
