package leetcode;

import java.util.ArrayList;
import java.util.List;
/**
 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 说明: 叶子节点是指没有子节点的节点。
 输入:

 1
 /   \
 2     3
 \
 5
 输出: ["1->2->5", "1->3"]
 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 * */
public class q257_binaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constrcutPath(root, "", paths);
        return paths;
    }
    public void constrcutPath(TreeNode root, String currentPath, List<String> paths){
        if(root != null){
            StringBuffer pathSB = new StringBuffer(currentPath);
            pathSB.append(root.val);
            if(root.left == null & root.right == null){
                paths.add(pathSB.toString());
            }else{
                pathSB.append("->");
                constrcutPath(root.left, pathSB.toString(), paths);
                constrcutPath(root.right, pathSB.toString(), paths);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //tree definition
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.right = new TreeNode(5);

        q257_binaryTreePaths op = new q257_binaryTreePaths();
        op.binaryTreePaths(root);
    }
}

