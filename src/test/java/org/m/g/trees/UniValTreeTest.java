package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

import java.util.Arrays;
import java.util.List;


public class UniValTreeTest {

    UniValTree uniValTree = new UniValTree();

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
        int executedCount = uniValTree.countUniValTree(simpleIntegerTree);
        Assert.assertEquals(executedCount,3);
    }

    @Test
    public void getUniValTree() {
        // Input:
        //			1
        //		2		3
        //   2     2       3
        //				1
        //			 1	   1

        TreeNode<Integer> uniValTreeData = TreeUtils.getUniValTree();
        int executedCount = uniValTree.countUniValTree(uniValTreeData);
        Assert.assertEquals(executedCount,6);
    }

}
