package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

public class RightNodeSum {

    public int getRightNodeSum(TreeNode<Integer> root) {
        int result = 0;
        if (root == null)
            return result;
        if (root.getRightNode() != null)
            result = root.getRightNode().getData();
        result += getRightNodeSum(root.getLeftNode());
        result += getRightNodeSum(root.getRightNode());
        return result;
    }
}
