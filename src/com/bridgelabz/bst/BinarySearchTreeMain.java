package com.bridgelabz.bst;

public class BinarySearchTreeMain {
	 public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(70);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		System.out.println("inorder traversal is:");
		myBinaryTree.inorderTraversal();
		System.out.println();
		System.out.println("the size of tree is :"+ myBinaryTree.getSize());
		
		System.out.println("IS 65 present? : "+ myBinaryTree.search(65));
		
	}
}
