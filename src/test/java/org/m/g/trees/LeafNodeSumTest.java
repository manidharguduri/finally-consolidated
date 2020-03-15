package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

public class LeafNodeSumTest {

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
       int result = nodeSum.getLeafNodeSum(simpleIntegerTree);
       Assert.assertEquals(result,18);
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
        int result = nodeSum.getLeafNodeSum(leftBasedTree);
        Assert.assertEquals(result,42);
    }
}