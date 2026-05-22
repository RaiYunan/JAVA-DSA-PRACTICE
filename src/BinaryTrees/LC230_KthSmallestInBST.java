package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC230_KthSmallestInBST {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }



    static int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        inorder(root,list);

        return list.get(k - 1);
    }

    static void inorder(TreeNode node,List<Integer> list) {

        if (node == null) {
            return;
        }

        inorder(node.left,list);

        list.add(node.val);

        inorder(node.right,list);
    }

    void main() {
        //       3
        //      / \
        //     1   4
        //      \
        //       2
        TreeNode root1 = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4)
        );
        System.out.println("1st smallest: " + kthSmallest(root1, 1)); // 1
        System.out.println("2nd smallest: " + kthSmallest(root1, 2)); // 2

        //         5
        //        / \
        //       3   6
        //      / \
        //     2   4
        //    /
        //   1
        TreeNode root2 = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1), null),
                        new TreeNode(4)),
                new TreeNode(6)
        );
        System.out.println("3rd smallest: " + kthSmallest(root2, 3)); // 3
    }
}