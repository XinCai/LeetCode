package DataStructure;

import lintcode.BinaryTreeDepth;

/**
 * Created by KXC176 on 6/12/2017.
 *
 * Binary Search Tree
 *
 * 若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
 * 若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
 * 任意节点的左、右子树也分别为二叉查找树；
 * 没有键值相等的节点。
 *
 *              3
 *            /    \
 *           1      5
 *           \     / \
 *            2   4   6
 *
 *
 *  二叉查找树相比于其他数据结构的优势在于查找、插入的时间复杂度较低。为O(log n)。
 *
 *  中序遍历二叉查找树可得到一个关键字的有序序列
 *  一个无序序列可以通过构造一棵二叉查找树变成一个有序序列
 *  构造树的过程 即为 对无序序列进行查找的过程
 *
 *  每次插入的新的结点都是二叉查找树上新的叶子结点，在进行插入操作时，不必移动其它结点，只需改动某个结点的指针，由空变为非空即可
 *
 */
public class BinarySearchTree {

    /**
     * insert new treeNode into Binary Search Tree
     * @param root
     * @param newNode
     */
    public void insertNode(TreeNode root, TreeNode newNode){
        if (root == null){
            root = newNode;
        }else{
            TreeNode current = root;

            // find a proper position in BST
            while (current != null){

                if (current.val < newNode.val){
                    if (current.right == null){
                        break;
                    }else {
                        current = current.right;
                    }
                }else{
                    if (current.left == null){
                        break;
                    }else{
                        current = current.left;
                    }
                }
            }

            if (current.val < newNode.val){
                current.right = newNode;
            }else{
                current.left = newNode;
            }
        }
    }

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3= new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node3.left = node1;
        node3.right = node5;
        node1.right = node2;
        node5.left = node4;
        node5.right = node6;

        TreeNode newNode = new TreeNode(8);
        System.out.println("before insertion :" + node6.right);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(node3, newNode);

        System.out.println("after insertion :" + node6.right);


    }
}
