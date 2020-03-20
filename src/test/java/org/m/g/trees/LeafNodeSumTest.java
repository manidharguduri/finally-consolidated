package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

public class LeafNodeSumTest {

    LeafNodeSum leafNodeSum = new LeafNodeSum();


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
       int result = leafNodeSum.getLeftNodeSum(simpleIntegerTree);
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
        int result = leafNodeSum.getLeftNodeSum(leftBasedTree);
        Assert.assertEquals(result,42);
    }
}
