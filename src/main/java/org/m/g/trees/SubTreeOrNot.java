package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import org.m.g.utils.TreeCommonUtils;
import sun.reflect.generics.tree.Tree;

public class SubTreeOrNot {

    public boolean isSubTreePresent(TreeNode<Integer> mainTree, TreeNode<Integer> subTree)
    {
        if(mainTree==null)
            return false;
        if(subTree==null)
            return true;
        if(TreeCommonUtils.isIdentical(mainTree,subTree))
        {
            return true;
        }
        return isSubTreePresent(mainTree.getLeftNode(),subTree.getLeftNode())
                && isSubTreePresent(mainTree.getRightNode(),subTree.getRightNode());
    }
}
