package BinaryTrees;

public class LC700_SearchInBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)      return root;
            else if (val < root.val)  root = root.left;
            else                      root = root.right;
        }
        return null;
    }

    void main() {
        //       BST:    4
        //              / \
        //             2   7
        //            / \
        //           1   3
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7)
        );

        TreeNode result = searchBST(root, 2);
        System.out.println("Found: " + (result != null ? result.val : "null"));

        TreeNode missing = searchBST(root, 5);
        System.out.println("Found: " + (missing != null ? missing.val : "null"));
    }
}
