package BinaryTrees;

public class LC235_LowestCommonAncestorBST {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val)       root = root.right;
            else if (root.val > p.val && root.val > q.val)  root = root.left;
            else                                             return root;
        }
        return null;
    }

    void main() {
        //        6
        //       / \
        //      2   8
        //     / \ / \
        //    0  4 7  9
        //      / \
        //     3   5
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9))
        );

        TreeNode p = new TreeNode(2), q = new TreeNode(8);
        System.out.println("LCA(2,8): " + lowestCommonAncestor(root, p, q).val); // 6

        p = new TreeNode(2); q = new TreeNode(4);
        System.out.println("LCA(2,4): " + lowestCommonAncestor(root, p, q).val); // 2
    }
}