package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

public class TopViewTreeTest {

    TopViewTree topViewTree = new TopViewTree();

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
        List<Integer> executedList = topViewTree.topView(simpleIntegerTree);
        List<Integer> expectedIntegerList = Arrays.asList(4, 2, 1, 3, 6, 9);
        Assert.assertThat("List equality without order",expectedIntegerList, containsInAnyOrder(executedList.toArray()));

    }
}