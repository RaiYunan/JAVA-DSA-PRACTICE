package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC144_BTPreorderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
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

    void main(){

    }
}
