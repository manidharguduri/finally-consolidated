package org.m.g.utils;

import org.m.g.trees.model.TreeNode;
import sun.reflect.generics.tree.Tree;

public class TreeCommonUtils {

    public static boolean isLeaf(TreeNode<Integer> treeNode) {
        if (treeNode == null)
            return false;
        return treeNode.getLeftNode() == null && treeNode.getRightNode() == null;
    }

    public static boolean isIdentical(TreeNode<Integer> input1,TreeNode<Integer> input2)
    {
       if(input1==null && input2==null)
         return true;

        return input1!=null && input2!=null
                && input1.getData().equals(input2.getData())
                && isIdentical(input1.getLeftNode(),input2.getLeftNode())
                && isIdentical(input2.getRightNode(),input2.getRightNode());
    }
}
