package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import sun.reflect.generics.tree.Tree;

public class TreeCommonUtils {

    public static boolean isLeaf(TreeNode<Integer> treeNode) {
        if (treeNode == null)
            return false;
        return treeNode.getLeftNode() == null && treeNode.getRightNode() == null;
    }
}
