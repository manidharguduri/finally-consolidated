package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

public class MaxPathSumTest {

    MaxPathSum maxPathSum = new MaxPathSum();

    @Test
    public void processingNegativeTree() {
        // Input:
        //			            1
        //		        2       		3
        //           4              5      -6
        //		 -7             -8
        //	   9
        List<List<Integer>> resultList = new ArrayList<>();
        TreeNode<Integer> negativeTree = TreeUtils.getNegativeTree();
        maxPathSum.findMaxSum(negativeTree);
        Assert.assertEquals(maxPathSum.maxResult,17);
    }

}
