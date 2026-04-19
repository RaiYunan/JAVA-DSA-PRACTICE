package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC145_BTPostOrderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
    static void postorder(TreeNode node, List<Integer> res){
        if(node==null) return;


        postorder(node.left,res);
        postorder(node.right,res);
        res.add(node.val);
    }

    void main(){

    }
}
