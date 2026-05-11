package BinaryTrees;

public class LC124_BinaryTreeMaxPathSum {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static int maxSum;

    static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }

    static int dfs(TreeNode node) {
        if (node == null) return 0;
        int left  = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));
        maxSum = Math.max(maxSum, node.val + left + right);
        return node.val + Math.max(left, right);
    }

    void main() {
        //      -10
        //      / \
        //     9  20
        //        / \
        //       15   7
        // Max path: 15 → 20 → 7 = 42
        TreeNode root1 = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        System.out.println("Max Path Sum: " + maxPathSum(root1)); // 42

        //   2
        //  / \
        // -1  3
        // Max path: 2 → 3 = 5
        TreeNode root2 = new TreeNode(2,
                new TreeNode(-1),
                new TreeNode(3)
        );
        System.out.println("Max Path Sum: " + maxPathSum(root2)); // 5
    }
}