package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC114_FlattenBinaryTreeToLinkedList {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    // Approach 1: Brute Force (preorder into list)
    static void flattenBruteForce(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).left  = null;
            list.get(i).right = list.get(i + 1);
        }
    }

    static void preorder(TreeNode node, List<TreeNode> list) {
        if (node == null) return;
        list.add(node);
        preorder(node.left,  list);
        preorder(node.right, list);
    }

    // Approach 2: Morris Traversal (in-place)
    static void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while (prev.right != null) prev = prev.right;
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left  = null;
            }
            curr = curr.right;
        }
    }

    static String print(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) { sb.append(node.val).append(node.right != null ? " -> " : ""); node = node.right; }
        return sb.toString();
    }

    void main() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))
        );
        flatten(root1);
        System.out.println("Morris : " + print(root1)); // 1 -> 2 -> 3 -> 4 -> 5 -> 6

        TreeNode root2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))
        );
        flattenBruteForce(root2);
        System.out.println("Brute  : " + print(root2)); // 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
}