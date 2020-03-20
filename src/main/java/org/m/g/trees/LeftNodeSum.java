package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

public class LeftNodeSum {

    public int getLeftNodeSum(TreeNode<Integer> root) {
        int result = 0;
        if (root == null)
            return result;
        if (root.getLeftNode() != null)
            result = root.getLeftNode().getData();
        result += getLeftNodeSum(root.getLeftNode());
        result += getLeftNodeSum(root.getRightNode());
        return result;
    }

}
