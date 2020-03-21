package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

public class MaxPathSum {

    int maxResult = 0;
    public int findMaxSum(TreeNode<Integer> rootNode)
    {
        if(rootNode==null)
            return 0;

       int data = rootNode.getData();
       int leftSum = findMaxSum(rootNode.getLeftNode());
       int rightSum = findMaxSum(rootNode.getRightNode());

       // getting the maximum of root data or (root data + Maximum of left or right tree)
       int maxOne = Math.max(data,data+Math.max(leftSum,rightSum));

       // finding the maximum from either (root+left+right) or above max
       int maxTwo = Math.max(maxOne,data+leftSum+rightSum);

       // update the result if max is found.
       maxResult = Math.max(maxResult,maxTwo);

       return maxOne;

    }
}
