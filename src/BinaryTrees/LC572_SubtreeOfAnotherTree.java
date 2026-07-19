package BinaryTrees;

public class LC572_SubtreeOfAnotherTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    /*
     * check if subRoot is a subtree of root
     * 1. at each node, check if trees are identical via isSame()
     * 2. if not, recursively check left and right subtrees
     * 3. isSame: both null → true, one null → false, else compare vals + recurse
     *
     * dfs + tree matching
     * O(n*m) time, O(h) space
     */
    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        return isSame(root, subRoot)
                || isSubtree(root.left,  subRoot)
                || isSubtree(root.right, subRoot);
    }

    static boolean isSame(TreeNode a, TreeNode b) {
        if (a == null || b == null) return a == b;
        return a.val == b.val
                && isSame(a.left,  b.left)
                && isSame(a.right, b.right);
    }

    void main() {
        //        3                 4
        //       / \              /   \
        //      4   5            1     2
        //     / \
        //    1   2
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5)
        );
        TreeNode subRoot1 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode subRoot2 = new TreeNode(4, new TreeNode(1), new TreeNode(3));

        System.out.println(isSubtree(root, subRoot1)); // true
        System.out.println(isSubtree(root, subRoot2)); // false
    }
}