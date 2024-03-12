package algotirhm_test;

import java.io.PushbackInputStream;
import java.util.Stack;

import algotirhm_test.BinaryTreeTraversalRecursion.TreeNode;

public class BinaryTreeTraversalIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.left = new TreeNode(6);
		head.right.right = new TreeNode(7);

//		preOrder(head);
//		System.out.println();
//		System.out.println("先序遍历递归版");

//		inOrder(head);
//		System.out.println();
//		System.out.println("中序遍历递归版");

		posOrderToneStack(head);
		System.out.println();
		System.out.println("后序遍历递归版");
	}
	
	//用栈实现先序
	public static void preOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(head);
		while (!stack.isEmpty()) {
			head = stack.pop();
			System.out.println(head.val + " ");
			if (head.right!=null) {
				stack.push(head.right);
			}
			if (head.left!=null) {
				stack.push(head.left);
			}
		}
	}
	
	
	//用栈实现中序
	public static void inOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		while (!stack.isEmpty() || head != null) {
			if (head!=null) {
				stack.push(head);
				head = head.left;
			}else {
				head = stack.pop();
				System.out.println(head.val + " ");
				head = head.right;
			}
		} 
	}
	
	
	//用栈实现后序
	public static void posOrderTwoStacks(TreeNode head) {
		if (head == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		Stack<TreeNode> collect = new Stack<>();
		stack.push(head);
		while (!stack.isEmpty()) {
			head = stack.pop();
			collect.push(head);
			if (head.left!=null) {
				stack.push(head.left);
			}
			if (head.right!=null) {
				stack.push(head.right);
			}
		}
		
		while (!collect.isEmpty()) {
			System.out.print(collect.pop().val + " ");
		}
		
		
	}
	
	
	public static void posOrderToneStack(TreeNode head) {
		if (head == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(head);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.peek();
			if (cur.left!=null && head != cur.left && head != cur.right) {
				stack.push(cur.left);
			} else if (cur.right!=null && head != cur.right) {
				stack.push(cur.right);
			}else{
				head = stack.pop();
				System.out.print(cur.val + " ");
			}
		}
		
	}

}
