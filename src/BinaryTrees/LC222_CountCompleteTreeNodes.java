package BinaryTrees;

public class LC222_CountCompleteTreeNodes {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int countNodes(TreeNode root){//recursive approach
        if(root==null) return 0;

        return 1+countNodes(root.left)+countNodes(root.right);
    }
    void main(){
        //       tree:     1
        //                / \
        //               2   3
        //              / \  /
        //             4  5 6

        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null)
        );
        System.out.println("Count: " + countNodes(root));
    }
}
