package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC94BTInorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            helper(root, res);
            return res;
        }

        private void helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                helper(root.left, res);  // Left
                res.add(root.val);       // Root
                helper(root.right, res); // Right
            }
        }

}
