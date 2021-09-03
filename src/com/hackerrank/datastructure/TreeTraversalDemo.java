package com.hackerrank.datastructure;

class TreeNode {
    int item;
    TreeNode left, right;

    TreeNode(int item) {
        this.item = item;
        left = right = null;
    }
}


public class TreeTraversalDemo {
    TreeNode root;

    TreeTraversalDemo() {
        root = null;
    }

    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.item + "->");
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.item + "->");
        inOrder(root.right);
    }

    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.item + "->");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TreeTraversalDemo tree = new TreeTraversalDemo();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(12);
        tree.root.left.left = new TreeNode(15);
        tree.root.left.right = new TreeNode(20);
        tree.root.right = new TreeNode(25);
        tree.root.right.left = new TreeNode(30);

        System.out.println("inorder traversal");
        tree.inOrder(tree.root);
        System.out.println("preOrder traversal");
        tree.preOrder(tree.root);
        System.out.println("postorder traversal");
        tree.postOrder(tree.root);
    }
}
