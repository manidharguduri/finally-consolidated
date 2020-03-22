package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeCommonUtils;

public class LeftLeafNodeSum {

    public int getLeftLeafNodeSum(TreeNode<Integer> treeNode, boolean isLeft) {
        int result = 0;
        if (treeNode == null)
            return 0;
        if (TreeCommonUtils.isLeaf(treeNode) && isLeft)
            result = treeNode.getData();

        result += getLeftLeafNodeSum(treeNode.getLeftNode(), true);
        result += getLeftLeafNodeSum(treeNode.getRightNode(), false);
        return result;
    }

}
