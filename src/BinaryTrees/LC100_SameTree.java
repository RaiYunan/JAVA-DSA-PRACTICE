package BinaryTrees;

public class LC100_SameTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    void main() {
        // Tree 1:   1        Tree 2:  1
        //          / \               / \
        //         2   3             2   3
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        // Tree 3:   1        Tree 4:   1
        //          /                    \
        //         2                      2
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));

        System.out.println("Same: "     + isSameTree(p1, q1));
        System.out.println("Not Same: " + isSameTree(p2, q2));
    }
}