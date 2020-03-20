package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

public class UniValTree {

    public int countUniValTree(TreeNode<Integer> rootNode) {
        int result = 0;
        if (rootNode == null)
            return 0;
        result += countUniValTree(rootNode.getLeftNode());
        result += countUniValTree(rootNode.getRightNode());
        if (isUniValTree(rootNode)) {
            result = result + 1;
        }
        return result;
    }

    public boolean isUniValTree(TreeNode<Integer> rootNode) {

        if (rootNode == null) return true;
        if (rootNode.getLeftNode() != null && !rootNode.getData().equals(rootNode.getLeftNode().getData()))
            return false;
        if (rootNode.getRightNode() != null && !rootNode.getData().equals(rootNode.getRightNode().getData()))
            return false;
        return isUniValTree(rootNode.getRightNode()) && isUniValTree(rootNode.getLeftNode());
    }
}
