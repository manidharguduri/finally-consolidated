package org.m.g.trees;

public class TreeUtils {

    public static TreeNode<Integer> getSimpleTree() {
        // Input:
        //			1
        //		2		3
        //   4     5       6
        //				7
        //				   8
        //				      9
        TreeNode<Integer> root = new TreeNode<>(1);
        root.setLeftNode(new TreeNode(2));
        root.getLeftNode().setLeftNode( new TreeNode(4));
        root.getLeftNode().setRightNode(new TreeNode(5));
        root.setRightNode(new TreeNode(3));
        root.getRightNode().setRightNode( new TreeNode(6));
        root.getRightNode().getRightNode().setLeftNode(new TreeNode(7));
        root.getRightNode().getRightNode().getLeftNode().setRightNode( new TreeNode(8));
        root.getRightNode().getRightNode().getLeftNode().getRightNode().setRightNode( new TreeNode(9));
        return root;
    }

}
