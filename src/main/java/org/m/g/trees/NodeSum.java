package org.m.g.trees;

import org.m.g.trees.model.TreeNode;
import sun.reflect.generics.tree.Tree;

public class NodeSum {

    public int getLeftNodeSum(TreeNode<Integer> root) {
        int result = 0;
        if (root == null)
            return result;
        if (root.getLeftNode() != null)
            result = root.getLeftNode().getData();
        result += getLeftNodeSum(root.getLeftNode());
        result += getLeftNodeSum(root.getRightNode());
        return result;
    }

    public int getRightNodeSum(TreeNode<Integer> root) {
        int result = 0;
        if (root == null)
            return result;
        if (root.getRightNode() != null)
            result = root.getRightNode().getData();
        result += getRightNodeSum(root.getLeftNode());
        result += getRightNodeSum(root.getRightNode());
        return result;
    }

    public int getLeafNodeSum(TreeNode<Integer> treeNode) {
        int result = 0;
        if (treeNode == null)
            return 0;
        if (isLeaf(treeNode))
            result = treeNode.getData();
        result += getLeafNodeSum(treeNode.getLeftNode());
        result += getLeafNodeSum(treeNode.getRightNode());
        return result;
    }

    public int getLeftLeafNodeSum(TreeNode<Integer> treeNode, boolean isLeft) {
        int result = 0;
        if (treeNode == null)
            return 0;
        if (isLeaf(treeNode) && isLeft)
            result = treeNode.getData();

        result += getLeftLeafNodeSum(treeNode.getLeftNode(), true);
        result += getLeftLeafNodeSum(treeNode.getRightNode(), false);
        return result;
    }

    public int getRightLeafNodeSum(TreeNode<Integer> treeNode, boolean isLeft) {
        int resultValue = 0;
        if (treeNode == null)
            return 0;
        if (isLeaf(treeNode) && isLeft)
            resultValue = treeNode.getData();

        resultValue += getRightLeafNodeSum(treeNode.getLeftNode(), false);
        resultValue += getRightLeafNodeSum(treeNode.getRightNode(), true);
        return resultValue;
    }

    public boolean isLeaf(TreeNode<Integer> treeNode) {
        if (treeNode == null)
            return false;
        return treeNode.getLeftNode() == null && treeNode.getRightNode() == null;
    }
}
