
public class Principal {

	public static void main(String[] args) {

		Node dois = new Node(2);
		
		Node cinco = new Node(5);
		Node seis = new Node(6);
		Node quatro = new Node(4, null, seis );
		Node tres = new Node(3, null, quatro);
		Node raiz = new Node(1, null, tres);
		
		BinaryTree teste = new BinaryTree(raiz);
		
		teste.addLeftChild(raiz, dois);
		teste.addLeftChild(tres, cinco);
		
		System.out.println(teste.isLeaf(raiz));
		System.out.println(teste.isInternal(raiz));
		//System.out.println(teste.getParent(dois).getValue());
	    
		teste.printPreOrder();
		
		System.out.println(teste.isStrictBinaryTree());
	}

}
