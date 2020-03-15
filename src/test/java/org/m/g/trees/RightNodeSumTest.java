package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

public class RightNodeSumTest {

    NodeSum rightNodeSum = new NodeSum();

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
        int sum = rightNodeSum.getRightNodeSum(simpleIntegerTree);
        Assert.assertEquals(sum,31);
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
        int sum = rightNodeSum.getRightNodeSum(leftBasedTree);
        Assert.assertEquals(sum,21);
    }

}
