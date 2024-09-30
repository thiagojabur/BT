
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
		return isFullBinaryTree(root,0,0);
	}
	
	
	public boolean isFullBinaryTree(Node root, int d, int level) {
		System.out.println("Checando " + root.value);
		
	    if (root == null)
	      return true;

	    // checa a presença de folhas 
	    if (root.leftNode == null && root.rightNode == null) {
	    	System.out.println("aqui2 " + level);
	    	return (d == level + 1);
	    }	

	    if (root.leftNode == null || root.rightNode == null) {
	      System.out.println("aqui");
	      return false;
	    }  

	    return isFullBinaryTree(root.leftNode, d, level + 1) && isFullBinaryTree(root.rightNode, d, level + 1);

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
			//System.out.println(" Nível: " + depth(root));
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
	
	public Node getParent(Node node) {
        if (this.root == null || this.root == node) {
            return null;
        }
        return getParent(this.root, node);
    }
	
	public Node getParent(Node subTree, Node node) {
        if (subTree == null){
            return null;
        }

        if (subTree.getLeftNode() == node || subTree.getRightNode() == node){
            return subTree;
        }

        Node parent;
        if((parent = getParent(subTree.getLeftNode(), node)) != null){
            return parent;
        }

        return getParent(subTree.getRightNode(), node);
    }
	
	
	
	public void setRoot(Node root) {
		this.root = root;
	}
}
