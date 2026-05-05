package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LC101_SymmetricTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    // Approach 1: Recursive
    static boolean isSymmetricRecursive(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    // Approach 2: Iterative (BFS)
    static boolean isSymmetricIterative(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode left  = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val)         return false;

            queue.offer(left.left);  queue.offer(right.right);
            queue.offer(left.right); queue.offer(right.left);
        }

        return true;
    }

    void main() {
        // Symmetric:      1
        //                / \
        //               2   2
        //              / \ / \
        //             3  4 4  3
        TreeNode symmetric = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );

        // Asymmetric:     1
        //                / \
        //               2   2
        //                \   \
        //                 3   3
        TreeNode asymmetric = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );

        System.out.println("Recursive  symmetric : " + isSymmetricRecursive(symmetric));   // true
        System.out.println("Recursive  asymmetric: " + isSymmetricRecursive(asymmetric));  // false
        System.out.println("Iterative  symmetric : " + isSymmetricIterative(symmetric));   // true
        System.out.println("Iterative  asymmetric: " + isSymmetricIterative(asymmetric));  // false
    }
}