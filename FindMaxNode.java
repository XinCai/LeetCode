package lintcode;

/**
 * Created by caixin on 2/12/17.
 *
 * 查找 二叉树的 最大节点
 *
 * 在二叉树中寻找值最大的节点并返回。
 *
 * Binary Tree Maximum Node
 *
 *        1
 *     /     \
 *   -5       2
 *   /  \   /   \
 * 0    3  -4   -5
 *
 * the max value node is 3
 *
 * return this node
 *
 *

 public class TreeNode{
     public int val;
     public TreeNode left;
     public TreeNode right;

     public TreeNode(int val){
         this.val = val;
         this.left = null;
         this.right = null;
    }
 }
 *
 */
public class FindMaxNode {

    // 定义一个最小的数值的 node, 全局变量，跟每一个node 的 value 来比较数值
    private TreeNode max = new TreeNode(Integer.MIN_VALUE);

    public TreeNode maxNode(TreeNode root){

        //root 为空节点
        if (root == null){
            return root;
        }

        //比较的 max 的value 和 当前root 的value。
        max = max.val > root.val ? max : root;

        maxNode(root.left);
        maxNode(root.right);

        return max;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-5);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-4);
        TreeNode node7 = new TreeNode(-5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        FindMaxNode findMaxNode = new FindMaxNode();
        System.out.println(findMaxNode.maxNode(node1).val);
    }
}
