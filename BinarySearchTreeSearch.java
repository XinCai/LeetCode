package DataStructure;

/**
 * Created by KXC176 on 7/12/2017.
 *
 * Binary Search Tree
 *
 * 若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值； The left subtree of a node contains only nodes with keys less than the node’s key.
 *
 * 若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值； The right subtree of a node contains only nodes with keys greater than the node’s key.
 *
 * 任意节点的左、右子树也分别为二叉查找树； The left and right subtree each must also be a binary search tree.
 *
 * 没有键值相等的节点。 There must be no duplicate nodes.
 *
 *
 *              3
 *            /    \
 *           1      5
 *           \     / \
 *            2   4   6
 *
 */
public class BinarySearchTreeSearch {
    public boolean search(TreeNode root, TreeNode target ){

        if (root == null){
            return false;
        }

        if (root.val == target.val){
            return true;
        }

        if (root.val < target.val){
            if (root.right == null){
                return false;
            }else{
                return search(root.right, target);
            }
        }

        if (root.val > target.val){
            if (root.left == null){
                return false;
            }else{
                return search(root.left, target);
            }
        }

        return false;
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

        BinarySearchTreeSearch binarySearchTreeSearch = new BinarySearchTreeSearch();
        System.out.println(binarySearchTreeSearch.search(node3,new TreeNode(10))); // return false
        System.out.println(binarySearchTreeSearch.search(node3,new TreeNode(0))); // return false
        System.out.println(binarySearchTreeSearch.search(node3,new TreeNode(5))); // return true
        System.out.println(binarySearchTreeSearch.search(node3,new TreeNode(6))); // return true


    }
}
