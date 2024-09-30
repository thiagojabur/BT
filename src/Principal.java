
public class Principal {

	public static void main(String[] args) {

		
		
		Node cinco = new Node(5);
		Node oito = new Node(8);
		Node nove = new Node(9);
		Node sete = new Node(7, oito, nove);
		Node seis = new Node(6);
		Node dois = new Node(2, seis, sete);
		
		
		
		Node quatro = new Node(4, null, null);
		Node tres = new Node(3, null, quatro);
		Node raiz = new Node(1, null, tres);
		
		BinaryTree teste = new BinaryTree(raiz);
		
		teste.addLeftChild(raiz, dois);
		teste.addLeftChild(tres, cinco);
		
		System.out.println(teste.isLeaf(raiz));
		System.out.println(teste.isInternal(raiz));
		System.out.println("Pai: " +teste.getParent(tres).getValue());
		System.out.println("Nível: " +teste.depth(raiz));
	    
		teste.printPreOrder();
		
		System.out.println(teste.isStrictBinaryTree());
		
		System.out.println("Folhas");
		teste.printLeafs();
		
		System.out.println("Internos");
		teste.printInternals();
		
		System.out.println("É full (cheia)?");
		System.out.println(teste.isFullBinaryTree());
		teste.printPostOrder();
	
	}
}
