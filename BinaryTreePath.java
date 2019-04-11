package Leetcode;

import java.lang.reflect.Array;
import java.util.*;

class TreeNode{
    public TreeNode(int val) {
        this.val = val;
    }

    int val;
    TreeNode left;
    TreeNode right;

}

public class BinaryTreePath {


    /**
     *
     *       1
     *      / \
     *     2   3
     *      \
     *       5
     *
     * @param args
     */


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.right = n5;

        //System.out.println(binaryTreePaths(n1));
        //System.out.println(binaryTreePaths1(n1).toString());
        ArrayList<TreeNode> leafNodes = new ArrayList<TreeNode>();
        printleafNode(n1,leafNodes);
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < leafNodes.size() ; i++) {

            result.add(preOrderTraversal(n1, leafNodes.get(i), ""));
        }

        System.out.println(result);

    }

    private static String preOrderTraversal(TreeNode root, TreeNode leafNode, String path) {
        if (root == null){
            return "";
        }
        path = path + root.val + "->";

        if (root != leafNode){

            preOrderTraversal(root.left, leafNode, path);

            preOrderTraversal(root.right, leafNode, path);
        }

        return path;

    }

    public static List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<String>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        HashSet<TreeNode> visitedNode = new HashSet<TreeNode>();

        stack.push(root);

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            TreeNode curr = stack.pop();
            visitedNode.add(curr);

            sb.append(curr.val + "->");

            if (curr.right !=null && !visitedNode.contains(curr.right)){
                stack.push(curr.right);
                visitedNode.add(curr.right);
            }

            if (curr.left !=null && !visitedNode.contains(curr.left)){
                stack.push(curr.left);
                visitedNode.add(curr.left);
            }

            if (curr.left ==null && curr.right == null){
               res.add(sb.substring(0,sb.length()-2));
               sb = new StringBuilder();
               stack.push(root);
            }
        }

        return res;
    }


    public static List<String> binaryTreePaths1(TreeNode root){

        List<String> paths = new ArrayList<String>();
        if (root == null) return paths;
        searchBT(root, "", paths);
        return paths;
    }

    private static void searchBT(TreeNode root, String s, List<String> paths) {
        if (root.left == null && root.right ==null) {
            paths.add(s + root.val);
        }

        if(root.left != null){
            searchBT(root.left, s + root.val + "->", paths);
        }

        if (root.right != null){
            searchBT(root.right, s + root.val + "->", paths);
        }
    }


    private static List<TreeNode> printleafNode(TreeNode root, ArrayList<TreeNode> leafNodes){
        if (root == null){
            return null;
        }
        if (root.left == null && root.right == null){
           // System.out.println(root.val);
            leafNodes.add(root);
        }

        if (root.left != null){
            printleafNode(root.left, leafNodes);
        }

        if (root.right !=null){
            printleafNode(root.right, leafNodes);
        }

        return leafNodes;
    }


}
