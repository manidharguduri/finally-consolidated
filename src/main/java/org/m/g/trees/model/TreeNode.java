package org.m.g.trees.model;

public class TreeNode<T> {

    private T data;

    private TreeNode<T> rightNode;

    private TreeNode<T> leftNode;

    public TreeNode()
    {
    }

    public TreeNode(T data)
    {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }
}
