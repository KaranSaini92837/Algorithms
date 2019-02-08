package com.algorithms;

public class BinaryTree {

	class Node {
		Node left, right;
		int key;

		Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	static Node root;

	public void insertNode(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		} else {
			if (key < root.key) {
				root.left = insertRec(root.left, key);
			} else if (key > root.key) {
				root.right = insertRec(root.right, key);
			}
		}
		return root;
	}

	public void inorder(Node r) {
		if (r == null) {
			return;
		}
		// System.out.println(r.key);
		inorder(r.left);
		 System.out.println(r.key);
		inorder(r.right);
		//System.out.println(r.key);

	}

	public boolean search(Node root, int key) {
		while (root != null) {
			if (root.key == key) {
				return true;
			}

			if (key < root.key) {
				root = root.left;
			} else if (key > root.key) {
				root = root.right;
			}
		}
		return false;
	}

	public static void main(String args[]) {

		BinaryTree bt = new BinaryTree();
		// bt.insertNode(4);
		// bt.insertNode(3);
		// bt.insertNode(2);
		// bt.insertNode(6);
		bt.daal(1);
		bt.daal(3);
		bt.daal(2);
		bt.daal(4);
		bt.daal(5);
		bt.inorder();
		System.out.println(bt.search(root, 1));
	}

	private void inorder() {
		inorder(root);
	}

	public void daal(int key) {
		root = daalRec(root, key);
	}

	private Node daalRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		} else {
			if (key < root.key) {
				root.left = daalRec(root.left, key);
			} else if (key > root.key) {
				root.right = daalRec(root.right, key);
			}
		}
		return root;
	}
}
