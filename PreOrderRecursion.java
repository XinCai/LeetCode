package lintcode;

import DataStructure.TreeNode;

/**
 * Created by KXC176 on 4/12/2017.
 *
 * Binary Tree
 *
 * 前序遍历递归版
 * 对于当前结点，先输出该结点，然后输出它的左孩子，最后输出它的右孩子。
 *
 * 先访问根结点，然后遍历其左右子树
 *
 *        1
 *       / \
 *      2   3
 *     /   /
 *    4   5
 *     \
 *      6
 *       \
 *        7
 *
 * output : 1 2 4 6 7 3 5
 */
public class PreOrderRecursion {
    /**
     * pre order travel binary tree
     *
     * @param root
     */
    public void PreOrderTravel(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println("node :" + root.val); // output current node value
        PreOrderTravel(root.left);  // output left sub-tree
        PreOrderTravel(root.right); // output right sub-tree
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node3.left = node5;
        node2.left = node4;
        node4.right = node6;
        node6.right = node7;

        PreOrderRecursion preOrderRecursion = new PreOrderRecursion();
        preOrderRecursion.PreOrderTravel(node1);

    }

}
