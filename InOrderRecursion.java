package lintcode;

import DataStructure.TreeNode;

/**
 * Created by KXC176 on 4/12/2017.
 *
 * 二叉树
 *
 * 中序遍历
 *
 * 对于当前结点，先输出它的左孩子，然后输出该结点，最后输出它的右孩子
 *
 *        1
 *      /   \
 *     2     3
 *    /     /
 *   4     5
 *    \
 *     6
 *      \
 *       7
 *
 *   inorder output : 4 6 7 2 1 5 3
 *
 *             1
 *          /     \
 *         2       3
 *        / \      /
 *       4   5    6
 *      /        / \
 *     7        8   9
 *
 *  inorder output : 7 4 2 5 1 8 6 9 3
 *
 */
public class InOrderRecursion {
    public void InOrderRec(TreeNode root){
        if (root == null){
            return;
        }

        InOrderRec(root.left);
        System.out.print(" "+root.val);
        InOrderRec(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        //     Tree 1
        node1.left = node2;
        node1.right = node3;
        node3.left = node5;
        node2.left = node4;
        node4.right = node6;
        node6.right = node7;

        //Tree 2
//        node1.left = node2;
//        node1.right = node3;
//        node2.left = node4;
//        node2.right = node5;
//        node4.left = node7;
//        node3.left = node6;
//        node6.left = node8;
//        node6.right = node9;

        InOrderRecursion inOrderRecursion = new InOrderRecursion();
        inOrderRecursion.InOrderRec(node1);
    }
}
