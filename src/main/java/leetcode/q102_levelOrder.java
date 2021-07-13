package leetcode;

import java.util.*;

public class q102_levelOrder {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int[] levelOrder(TreeNode root){
        if(root == null) return new int[0];
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] tmp = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            tmp[i] = res.get(i);
        return tmp;
    }

    public static void main(String[] args) {
        q102_levelOrder obj = new q102_levelOrder();
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(9);
        input.right = new TreeNode(20);
        input.right.left = new TreeNode(15);
        input.right.right = new TreeNode(7);
        int[] res = obj.levelOrder(input);
        System.out.println();
    }
}
