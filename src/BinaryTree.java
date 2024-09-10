
public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public boolean isLeaf(Node node) {
		if (node.getLeftNode() == null && node.getRightNode()==null)
		  return true;
		return false;
	}
	
	public boolean isInternal(Node node) {
		return !isLeaf(node); 
	}

	public Node getRoot() {
		return root;
	}

	//profundidade
	public int depth(BinaryTree T, Node node) {
		if (node == root)
			return 0;
		else   
			return 1 + depth(T, T.getParent(node));
	}
	
	public Node getParent(Node element) {
		return getParent(element, root);
    }
	
	public Node getParent(Node element, Node root) {
		
		if (root==null) return null;
		int value = element.getValue();
		
		if (root.getLeftNode() != null && root.getLeftNode().getValue() == value) return root;
		if (root.getRightNode() != null && root.getRightNode().getValue() == value) return root;
		
		//chamar a função ela mesma 
		if (value < root.getValue()) 
			return getParent(element, root.getLeftNode());
		else 
			return getParent(element, root.getRightNode());
	}
	
	
	public void setRoot(Node root) {
		this.root = root;
	}
}
