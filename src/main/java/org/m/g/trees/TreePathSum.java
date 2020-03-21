package org.m.g.trees;

import org.m.g.trees.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreePathSum {

    List<Integer> queue = new ArrayList<>();

    // function which returns the number of path...
    public void noOfPaths(TreeNode<Integer> treeNode, List<List<Integer>> resultList, int val) {
        if (treeNode == null)
            return;
        queue.add(treeNode.getData());
        noOfPaths(treeNode.getLeftNode(), resultList, val);
        noOfPaths(treeNode.getRightNode(), resultList, val);

        int sum = 0;
        for (int index = queue.size()-1; index >= 0; index--) {
            sum += queue.get(index);
            if (val == sum) {
                List<Integer> oneSet = new ArrayList<>();
                for (int tempIndex = index; tempIndex < queue.size(); tempIndex++) {
                    oneSet.add(queue.get(tempIndex));
                }
                resultList.add(oneSet);
            }
        }
        queue.remove(treeNode.getData());
    }
}
