package lintcode;

import DataStructure.TreeNode;

/**
 * Created by KXC176 on 4/12/2017.
 *
 * 二叉树是一种非常重要的数据结构，
 *
 * 很多其它数据结构都是基于二叉树的基础演变而来的。
 *
 * 对于二叉树，有前序、 PreOrderDev
 *
 * 中序 InOrder
 *
 * 以及后序三种遍历方法 PostOrder
 *
 * 因为树的定义本身就是递归定义，因此采用递归的方法去实现树的三种遍历不仅容易理解而且代码很简洁。
 *
 * 而对于树的遍历若采用非递归的方法，就要采用栈去模拟实现。
 *
 * 在三种遍历中，前序和中序遍历的非递归算法都很容易实现，非递归后序遍历实现起来相对来说要难一点
 *
 * 后序遍历(Postorder Traversal,LRN)
 *
 * 先访问左右子树，再访问根结点
 *
 *
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
 * post order : 7 6 4 2 5 3 1
 *
 *             1
 *          /     \
 *         2       3
 *        / \      /
 *       4   5    6
 *      /        / \
 *     7        8   9
 *
 *
 * postorder: 7 4 5 2 8 9 6 3 1
 *
 */
public class PostOrderTraversal {

    /**
     * Tree Node
     * @param root
     */
    public void postOrder(TreeNode root){
        // post order traversal
        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
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

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.postOrder(node1);
    }
}
