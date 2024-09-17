
public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public void printPreOrder() {
		printPreOrder(this.root);
	}
	
	public void printPreOrder(Node root) {
		if (root == null)
			return;
		System.out.println(root.value);
		
		printPreOrder(root.getLeftNode());
		printPreOrder(root.getRightNode());
		
	}
	
	public void printPostOrder() {
		printPostOrder(this.root);
	}
	
	public void printPostOrder(Node root) {
		if (root == null)
			return;
		
		printPostOrder(root.getLeftNode());
		printPostOrder(root.getRightNode());
		System.out.println(root.value);
		
		
	}
	
	public void printInOrder() {
		printInOrder(this.root);
	}
	
	public void printInOrder(Node root) {
		if (root == null)
			return;
		
		printInOrder(root.getLeftNode());
		System.out.println(root.value);
		printInOrder(root.getRightNode());

	}
	
	public boolean isStrictBinaryTree() {
		return isStrictBinaryTree(this.root);
	}
	
	
	public boolean isStrictBinaryTree(Node root) {
		//condição de saída
		if (root == null) return true;
		
		if (root.degree() == 1)	return false;
		
		return isStrictBinaryTree(root.leftNode)&& isStrictBinaryTree(root.rightNode);
		
	}
	
	public void addLeftChild(Node node, Node leftChild) {
		node.setLeftNode(leftChild);
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
