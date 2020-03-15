package org.m.g.trees;


import org.m.g.trees.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopViewTree {

    public List<Integer> topView(TreeNode<Integer> rootNode) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, TreeNode> map = new HashMap<>();
        topViewUtil(rootNode, map, 0);
        List<TreeNode> values = new ArrayList<>(map.values());
        for(TreeNode<Integer> value : values)
        {
            result.add(value.getData());
        }
        return result;
    }

    private static void topViewUtil(TreeNode root, Map<Integer, TreeNode> map, int vertical) {
        if (root == null)
            return;
        if (!map.containsKey(vertical)) {
            map.put(vertical, root);
        }
        topViewUtil(root.getLeftNode(), map, vertical - 1);
        topViewUtil(root.getRightNode(), map, vertical + 1);
    }
}