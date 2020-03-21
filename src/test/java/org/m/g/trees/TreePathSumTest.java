package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

public class TreePathSumTest {

    TreePathSum treePathSum = new TreePathSum();

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
        treePathSum.noOfPaths(negativeTree,resultList,9);
        Assert.assertEquals(resultList.size(),3);
    }

}
