package lintcode;

import DataStructure.TreeNode;

/**
 * Created by KXC176 on 5/12/2017.
 *
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
 *        output : 5
 */
public class BinaryTreeDepth {

    public int result = 0;

    public int maxDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return result;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(leftDepth>rightDepth){
            return leftDepth + 1 + result;
        }else{
            return rightDepth + 1 + result;
        }
    }

//    public int maxDepth02(TreeNode root){
//
//    }

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

        BinaryTreeDepth binaryTreeDepth = new BinaryTreeDepth();

        System.out.println(binaryTreeDepth.maxDepth(node1));

    }
}
