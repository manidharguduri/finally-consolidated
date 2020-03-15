package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeUtils;
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
        Assert.assertThat("List equality without order", expectedIntegerList, containsInAnyOrder(executedList.toArray()));
    }

    @Test
    public void getLeftBasedTree() {
        // Input:
        //			            1
        //		        2       		3
        //           4              5       6
        //		  7             8
        //	   9	         13   12
        //		          15

        TreeNode<Integer> leftBasedTree = TreeUtils.getLeftBasedTree();
        List<Integer> executedList = topViewTree.topView(leftBasedTree);
        List<Integer> expectedIntegerList = Arrays.asList(1, 2, 3, 4, 6, 7,9);
        Assert.assertThat("List equality without order", expectedIntegerList, containsInAnyOrder(executedList.toArray()));
    }

}