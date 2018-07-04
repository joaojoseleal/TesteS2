public class Main {
	public static void main(String[] args) {
		// No raiz
		BinaryTree tree = new BinaryTree(20);
		int[] values = new int[] { 25, 22, 28, 15, 12, 16 };
		
		for (int v : values) {
			BinaryTree.insert(tree, v);
		}
		BinaryTree node = BinaryTree.getNodeByValue(tree, 20);
		int sum = BinaryTree.getSumAfterNode(node);
		System.out.println("Soma: " + sum);
	}
}
