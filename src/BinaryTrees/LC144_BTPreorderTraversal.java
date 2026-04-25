package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC144_BTPreorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }
    static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    static void preorder(TreeNode node,List<Integer> res){
        if(node==null) return;

        res.add(node.val);
        preorder(node.left,res);
        preorder(node.right,res);
    }

    //  Iterative Approach
    static List<Integer> preorderIterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) stack.push(node.right); // right first
            if (node.left != null) stack.push(node.left);   // left on top
        }

        return res;
    }
    void main(){
        // Build tree:     1
        //                / \
        //               2   3
        //              / \
        //             4   5
        // Expected preorder: [1, 2, 4, 5, 3]
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );

        System.out.println( preorderTraversal(root));
        System.out.println( preorderIterative(root));
    }
}
