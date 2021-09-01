package com.bridgelabz.bst;

public class BinarySearchTreeMain {
	 public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		
		System.out.println("inorder traversal is:");
		myBinaryTree.inorderTraversal();
	}
}
