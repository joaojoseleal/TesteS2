public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int valor) {
		this.valor = valor;
	}
	
	public static void insert(BinaryTree node, int valor) {
		if (node != null) {
			if (valor < node.valor) {
				if (node.left != null) {
					insert(node.left, valor);
				} else {
					node.left = new BinaryTree(valor);
				}
			} else if (valor > node.valor) {
				if (node.right != null) {
					insert(node.right, valor);
				} else  {
					node.right = new BinaryTree(valor);
				}
			}
		}
	}
	
	private static int getSumValuesTree(BinaryTree node) {
		int sum;
		if (node != null) {
			sum = getSumValuesTree(node.left) + getSumValuesTree(node.right) + node.valor;
			return sum;
		} else {
			return 0;
		}
	}
	
	public static int getSumAfterNode(BinaryTree node) {
		/*
		 * Soma todos os nós filhos do nó informado e depois subtrai o valor do nó informado.
		 */
		if (node != null) {
			return getSumValuesTree(node) - node.valor;
		}
		return 0;
		
	}
	
	public static BinaryTree getNodeByValue(BinaryTree tree, int value) {
		if (tree != null) {
			if (value == tree.valor) {
				return tree;
			} else {
				if (value < tree.valor) {
					if (tree.left != null) {
						return getNodeByValue(tree.left, value);
					} else {
						System.out.println("Valor não encontrado na árvore.");
						return null;
					}
				} else if (value > tree.valor) {
					if (tree.right != null) {
						return getNodeByValue(tree.right, value);
					} else {
						System.out.println("Valor não encontrado na árvore.");
						return null;
					}
				}
			}
		}
		return null;
	}
}
