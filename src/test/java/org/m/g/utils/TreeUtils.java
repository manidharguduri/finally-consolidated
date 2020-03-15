package org.m.g.utils;

import org.m.g.trees.model.TreeNode;
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

    public static TreeNode<Integer> getLeftBasedTree() {
        // Input:
        //			            1
        //		        2       		3
        //           4              5       6
        //		  7             8
        //	   9	         13   12
        //		          15
        TreeNode<Integer> root = new TreeNode<>(1);
        root.setLeftNode(new TreeNode(2));
        root.setRightNode(new TreeNode<>(3));
        root.getLeftNode().setLeftNode(new TreeNode<>(4));
        root.getLeftNode().getLeftNode().setLeftNode(new TreeNode<>(7));
        root.getLeftNode().getLeftNode().getLeftNode().setLeftNode(new TreeNode<>(9));
        root.getRightNode().setLeftNode(new TreeNode<>(5));
        root.getRightNode().setRightNode(new TreeNode<>(6));
        root.getRightNode().getLeftNode().setLeftNode(new TreeNode<>(8));
        root.getRightNode().getLeftNode().getLeftNode().setLeftNode(new TreeNode<>(13));
        root.getRightNode().getLeftNode().getLeftNode().setRightNode(new TreeNode<>(12));
        root.getRightNode().getLeftNode().getLeftNode().getLeftNode().setLeftNode(new TreeNode<>(15));
        return root;
    }
}