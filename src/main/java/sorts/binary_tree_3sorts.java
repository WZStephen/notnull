package sorts;

class TreeNode{
    private TreeNode left;
    private TreeNode right;
    private int val;

    public TreeNode(){}
    public TreeNode(int val) {
        super();
        this.val = val;
    }
    public TreeNode(TreeNode left, TreeNode right, int val) {
        super();
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    /** 前序遍历 */
    private void preOrder(TreeNode root) {
        if(root != null) {
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    /** 中序遍历 */
    private void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }


    /** 后序遍历 */
    private void postOrder(TreeNode root) {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }

    /** 递归查找 */
    private TreeNode search(TreeNode x, int key) {
        if (x==null)
            return x;

        if (x.val < key)
            return search(x.left, key);
        else if (x.val > key)
            return search(x.right, key);
        else
            return x;
    }

    /** 非递归查找 */
    private TreeNode iterativeSearch(TreeNode x, int key) {
        while (x!=null) {
            if (x.val < key)
                x = x.left;
            else if (x.val > key)
                x = x.right;
            else
                return x;
        }
        return x;
    }

    /** 最大，最小值 */
    private TreeNode maximum(TreeNode tree) {
        if (tree == null)
            return null;

        while(tree.right != null)
            tree = tree.right;
        return tree;
    }
    private TreeNode minimum(TreeNode tree) {
        if (tree == null)
            return null;

        while(tree.left != null)
            tree = tree.left;
        return tree;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(new TreeNode(4), new TreeNode(9), 7);

    }

}
