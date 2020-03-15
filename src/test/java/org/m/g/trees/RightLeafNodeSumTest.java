package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

public class RightLeafNodeSumTest {

    NodeSum nodeSum = new NodeSum();


    @Test
    public void simpleTree() {
        // Input:
        //			1
        //		2		3
        //   4     5       6
        //				7
        //				   8
        //				      9
        TreeNode<Integer> simpleIntegerTree = TreeUtils.getSimpleTree();
        int result = nodeSum.getRightLeafNodeSum(simpleIntegerTree,false);
        Assert.assertEquals(result,14);
    }

    @Test
    public void leftBasedTree() {
        // Input:
        //			            1
        //		        2       		3
        //           4              5       6
        //		  7             8
        //	   9	         13   12
        //		          15

        TreeNode<Integer> leftBasedTree = TreeUtils.getLeftBasedTree();
        int result = nodeSum.getRightLeafNodeSum(leftBasedTree,false);
        Assert.assertEquals(result,18);
    }

}
