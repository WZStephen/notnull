package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {
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

        binaryTreePaths op = new binaryTreePaths();
        op.binaryTreePaths(root);
    }
}

