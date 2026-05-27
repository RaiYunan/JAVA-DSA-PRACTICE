package BinaryTrees;

public class LC114_FlattenBinaryTreeToLinkedList {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    static void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while (prev.right != null) prev = prev.right;
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left  = null;
            }
            curr = curr.right;
        }
    }

    static String print(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) { sb.append(node.val).append(node.right != null ? " -> " : ""); node = node.right; }
        return sb.toString();
    }

    void main() {
        //       1
        //      / \
        //     2   5
        //    / \   \
        //   3   4   6

        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))
        );

        flatten(root);
        System.out.println(print(root)); // 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
}