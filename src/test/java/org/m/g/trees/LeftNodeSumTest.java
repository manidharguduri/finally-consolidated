package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class LeftNodeSumTest {

    NodeSum leftNodeSum = new NodeSum();

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
        int sum = leftNodeSum.getLeftNodeSum(simpleIntegerTree);
        Assert.assertEquals(sum,13);
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

        TreeNode<Integer> simpleIntegerTree = TreeUtils.getLeftBasedTree();
        int sum = leftNodeSum.getLeftNodeSum(simpleIntegerTree);
        Assert.assertEquals(sum,63);
    }

}
