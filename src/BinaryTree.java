
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
	
	public void printInternals() {
		printInternals(this.root);
	}
	
	public void printInternals(Node root) {
		if (root == null)
			return;
		printInternals(root.getLeftNode());
		if (isInternal(root))
			System.out.println(root.value);
		
		printInternals(root.getRightNode());
	}
	
	public boolean isFullBinaryTree() {
		return isFullBinaryTree(this.root,0);
	}
	
	public boolean isFullBinaryTree(Node root, int nivelAnterior) {
		if (root == null)
			return false;
		int nivel;
		nivel = depth(root);
		if (isLeaf(root)) {
			System.out.println(root.value);
			System.out.println("Nível: " +nivel);	
			if (nivel != nivelAnterior) {
				System.out.println("niveis diferentes");
				return false;	
			}	
		}
		
		if (nivel == nivelAnterior) {
			System.out.println("Comparou " + nivel + " "+ nivelAnterior);
			return isFullBinaryTree(root.getLeftNode(), nivel) && 	
			 isFullBinaryTree(root.getRightNode(), nivel);
			
		} else 
			return false;
	}
	
	
	public void printLeafs() {
		printLeafs(this.root);
	}
	
	
	public void printLeafs(Node root) {
		if (root == null)
			return;
		printLeafs(root.getLeftNode());
		if (isLeaf(root)) {
			System.out.println(root.value);
			
		}
			
		printLeafs(root.getRightNode());
		
		
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
	
	public int depth(Node node) {
		return depth(this, node);
	}
	
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
