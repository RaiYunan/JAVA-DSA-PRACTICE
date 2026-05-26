package BinaryTrees;

public class LC1008_ConstructBSTFromPreorder {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

    }

    static TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length - 1);
    }

    static TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(preorder[start]);
        int split = start + 1;
        while (split <= end && preorder[split] < preorder[start]) split++;
        root.left = build(preorder, start + 1, split - 1);
        root.right = build(preorder, split, end);
        return root;
    }

    static String inorder(TreeNode node) {
        if (node == null) return "";
        return inorder(node.left) + node.val + " " + inorder(node.right);
    }

    void main() {
        // preorder: [8, 5, 1, 7, 10, 12]
        // expected BST inorder: 1 5 7 8 10 12
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = bstFromPreorder(preorder);
        System.out.println("Inorder: " + inorder(root));
        System.out.println("Root   : " + root.val);
        System.out.println("Left   : " + root.left.val);
        System.out.println("Right  : " + root.right.val);
    }
}