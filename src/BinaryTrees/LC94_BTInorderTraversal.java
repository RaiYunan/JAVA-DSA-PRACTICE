package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC94_BTInorderTraversal {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    // Approach 1: Recursive
    static List<Integer> inorderRecursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    static void dfs(TreeNode node, List<Integer> res) {
        if (node == null) return;
        dfs(node.left, res);
        res.add(node.val);
        dfs(node.right, res);
    }

    // Approach 2: Iterative
    static List<Integer> inorderIterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;
    }

     void main() {
        //       tree:   1
        //                \
        //                 2
        //                /
        //               3
        // Expected inorder: [1, 3, 2]
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );

        System.out.println("Recursive : " + inorderRecursive(root));
        System.out.println("Iterative : " + inorderIterative(root));
    }
}