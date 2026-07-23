package BinaryTrees;

public class LC236_LowestCommonAncestorOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    /*
     * find lowest common ancestor of p and q in a binary tree
     * 1. if root is null/p/q, return root
     * 2. recurse left and right subtrees
     * 3. if both sides return non-null, current node is LCA
     * 4. otherwise return whichever side found a match
     *
     * post-order dfs
     * O(n) time, O(h) space
     */
    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left  = lowestCommonAncestor(root.left,  p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    void main() {
        //        3
        //       / \
        //      5   1
        //     / \ / \
        //    6  2 0  8
        //      / \
        //     7   4
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8))
        );

        TreeNode p = root.left;        // 5
        TreeNode q = root.right;       // 1
        System.out.println(lowestCommonAncestor(root, p, q).val); // 3

        p = root.left;                 // 5
        q = root.left.right.right;     // 4
        System.out.println(lowestCommonAncestor(root, p, q).val); // 5
    }
}