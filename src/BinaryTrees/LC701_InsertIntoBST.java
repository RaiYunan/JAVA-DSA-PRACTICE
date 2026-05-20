package BinaryTrees;

public class LC701_InsertIntoBST {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left  = insertIntoBST(root.left,  val);
        else                root.right = insertIntoBST(root.right, val);
        return root;
    }

    static String inorder(TreeNode node) {
        if (node == null) return "";
        return inorder(node.left) + node.val + " " + inorder(node.right);
    }

    void main() {
        //       4
        //      / \
        //     2   7
        //    / \
        //   1   3
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7)
        );

        System.out.println("Before: " + inorder(root));
        root = insertIntoBST(root, 5);
        System.out.println("After  inserting 5: " + inorder(root));
        root = insertIntoBST(root, 6);
        System.out.println("After  inserting 6: " + inorder(root));
    }
}