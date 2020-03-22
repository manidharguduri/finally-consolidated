package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeCommonUtils;

public class RightLeafNodeSum {

    public int getRightLeafNodeSum(TreeNode<Integer> treeNode, boolean isLeft) {
        int resultValue = 0;
        if (treeNode == null)
            return 0;
        if (TreeCommonUtils.isLeaf(treeNode) && isLeft)
            resultValue = treeNode.getData();

        resultValue += getRightLeafNodeSum(treeNode.getLeftNode(), false);
        resultValue += getRightLeafNodeSum(treeNode.getRightNode(), true);
        return resultValue;
    }
}
