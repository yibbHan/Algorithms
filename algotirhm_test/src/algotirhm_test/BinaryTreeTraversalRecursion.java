package algotirhm_test;


public abstract class BinaryTreeTraversalRecursion {
	
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}
	
	//先序
	public static void preOrder(TreeNode tree) {
		if (tree == null) {
			return;
		}
		System.out.println(tree.val + " ");
		preOrder(tree.left);
		preOrder(tree.right);
	}
	
	//中序
	public static void inOrder(TreeNode tree) {
		if (tree == null) {
			return;
		}
		inOrder(tree.left);
		System.out.println(tree.val + " ");
		inOrder(tree.right);
	}
	
	//后序
	public static void posOrder(TreeNode tree) {
		if (tree == null) {
			return;
		}
		posOrder(tree.left);
		posOrder(tree.right);
		System.out.println(tree.val + " ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.left = new TreeNode(6);
		head.right.right = new TreeNode(7);

		preOrder(head);
		System.out.println();
		System.out.println("先序遍历递归版");

		inOrder(head);
		System.out.println();
		System.out.println("中序遍历递归版");

		posOrder(head);
		System.out.println();
		System.out.println("后序遍历递归版");
	}
	

}
