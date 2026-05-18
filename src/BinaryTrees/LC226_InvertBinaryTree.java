package BinaryTrees;

public class LC226_InvertBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp  = root.left;
        root.left      = root.right;
        root.right     = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    static String print(TreeNode node) {
        if (node == null) return "null";
        return node.val + " [" + print(node.left) + ", " + print(node.right) + "]";
    }

    void main() {
        //      4                    4
        //     / \       →          / \
        //    2   7                7   2
        //   / \ / \              / \ / \
        //  1  3 6  9            9  6 3  1
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );

        System.out.println("Before: " + print(root));
        System.out.println("After : " + print(invertTree(root)));
    }
}
