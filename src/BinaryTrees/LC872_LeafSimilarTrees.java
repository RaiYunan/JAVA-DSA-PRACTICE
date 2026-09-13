package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC872_LeafSimilarTrees {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    // iterative dfs - O(n) time | O(n) space
    static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return getLeaves(root1).equals(getLeaves(root2));
    }

    static List<Integer> getLeaves(TreeNode root) {
        List<Integer> leaves = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left == null && node.right == null) { leaves.add(node.val); continue; }
            if (node.right != null) stack.push(node.right);
            if (node.left  != null) stack.push(node.left);
        }
        return leaves;
    }

    void main() {
        //        3                 3
        //       / \              /   \
        //      5   1            5     1
        //     / \ / \          / \   / \
        //    6  2 9  8        6   7 4   2
        //      / \
        //     7   4
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2)));

        System.out.println(leafSimilar(root1, root2)); // true
    }
}
