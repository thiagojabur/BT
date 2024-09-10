
public class Principal {

	public static void main(String[] args) {

		Node dois = new Node(2);
		Node quatro = new Node(4);
		Node tres = new Node(3, null, quatro);
		Node raiz = new Node(1, dois, tres);
		
		BinaryTree teste = new BinaryTree(raiz);
		
		System.out.println(teste.isLeaf(raiz));
		System.out.println(teste.isInternal(raiz));
		System.out.println(teste.getParent(quatro).getValue());
	}

}
