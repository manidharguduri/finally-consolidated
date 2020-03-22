package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeCommonUtils;

public class MaxPathSumBetweenLeafs {

    public int maxSum = 0;

    public int getMaxSum(TreeNode<Integer> treeNode)
    {
        if(treeNode==null)
            return 0;

        if(TreeCommonUtils.isLeaf(treeNode))
            return treeNode.getData();

        int leftSum = getMaxSum(treeNode.getLeftNode());
        int rightSum = getMaxSum(treeNode.getRightNode());
        int currentSum = leftSum+rightSum+treeNode.getData();

        if(maxSum<currentSum)
        {
            maxSum = currentSum;
        }

        return treeNode.getData()+Math.max(leftSum,rightSum);
    }

}
