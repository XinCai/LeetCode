package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caixin on 10/12/17.
 *
 * binary tree
 *             1
 *            / \
 *           2  6
 *          /
 *         3
 *        /
 *       4
 *      /
 *     5
 *
 *
 * output : [1->2->3]
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        node1.right = node6;

        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        System.out.println(binaryTreePaths.solution(node1));

    }
    public List<String> solution(TreeNode root){

        List<String> result = new ArrayList<String>();

        if (root == null){
            return result;
        }

        helper(result,root,"");

        return  result;
    }

    public void helper(List<String> result, TreeNode root, String path){

        //leaf node
        if (root.right == null && root.left == null){
            result.add(path + root.val);
        }

        // not leaf node， 左节点
        if (root.left != null){
            //递归调用
            helper(result,root.left, path+root.val+ "->");
        }

        // not leaf node , 右节点
        if (root.right!=null){
            helper(result,root.right,path+root.val+"->");
        }

    }
}
