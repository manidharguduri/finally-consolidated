package org.m.g.trees;

import org.junit.Assert;
import org.junit.Test;
import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeCommonUtils;
import org.m.g.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

public class SubTreeOrNotTest {

    SubTreeOrNot subTreeOrNot = new SubTreeOrNot();



    @Test
    public void testingDifferentTrees() {
       boolean result =  subTreeOrNot.isSubTreePresent(TreeUtils.getSimpleTree(),TreeUtils.getLeftBasedTree());
        Assert.assertEquals(result,false);
    }

    @Test
    public void testingSameTree() {
        boolean result =  subTreeOrNot.isSubTreePresent(TreeUtils.getSimpleTree(),TreeUtils.getSimpleTree());
        Assert.assertEquals(result,true);
    }

    @Test
    public void testingRealSubTree() {
        boolean result =  subTreeOrNot.isSubTreePresent(TreeUtils.getMainTree(),TreeUtils.getMainTree());
        Assert.assertEquals(result,true);
    }

}
