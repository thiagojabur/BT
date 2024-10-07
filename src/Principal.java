
public class Principal {

	public static void main(String[] args) {


		Node cinco = new Node(5);
		Node oito = new Node(8);
		Node nove = new Node(9);
		Node sete = new Node(7);
		Node seis = new Node(6);
		Node dois = new Node(2);

		Node quatro = new Node(4);
		Node tres = new Node(3);
		Node raiz = new Node(1);
		
		BinaryTree teste = new BinaryTree(cinco);
		
		
		teste.insertNode(tres);
		teste.insertNode(dois);
		
		//System.out.println(teste.isLeaf(raiz));
		//System.out.println(teste.isInternal(raiz));
		//System.out.println("Nível: " +teste.depth(raiz));
	    
		teste.printInOrder();
		
		//System.out.println(teste.isStrictBinaryTree());
		
		System.out.println("Folhas");
		teste.printLeafs();
		
		System.out.println("Internos");
		teste.printInternals();
		
		System.out.println("É full (cheia)?");
		System.out.println(teste.isFullBinaryTree());
		//teste.printPostOrder();
	
		teste.deleteNode(dois);
		
		teste.printInOrder();
		
	}
}
