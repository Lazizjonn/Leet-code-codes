package LeetCode.dfs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTransversal {
}


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode root, int level) {
        // root is empty;
        if (root == null) return;
        if (result.size() <= level) result.add(level, new ArrayList<>());

        result.get(level).add(root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}