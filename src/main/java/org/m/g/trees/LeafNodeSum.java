package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

public class LeafNodeSum {

    public int getLeafNodeSum(TreeNode<Integer> treeNode) {
        int result = 0;
        if (treeNode == null)
            return 0;
        if (TreeCommonUtils.isLeaf(treeNode))
            result = treeNode.getData();
        result += getLeafNodeSum(treeNode.getLeftNode());
        result += getLeafNodeSum(treeNode.getRightNode());
        return result;
    }

}
