package leetcode;


import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class FindModeInBinarySearchTree {

    public static void main(String[] args) {
        TreeNode A  = new TreeNode(1);
        TreeNode B  = new TreeNode(2);
        TreeNode C = new TreeNode(2);

        A.right = B;
        B.left = C;

        FindModeInBinarySearchTree findModeInBinarySearchTree = new FindModeInBinarySearchTree();
        findModeInBinarySearchTree.findMode(A);
    }



    public int[] findMode(TreeNode root) {

        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> duplicate = new Stack();

        preorder(root,visited,duplicate);

        int[] result = new int[duplicate.size()];
        for (int i = 0; i < duplicate.size(); i++) {
            result[i] = duplicate.pop();
        }

        return result;

    }

    void preorder(TreeNode root, HashSet<Integer> visited, Stack<Integer> duplicate){

        if (root == null){
            return;
        }

        System.out.println(root.val);


        if (!visited.contains(root.val)){
                visited.add(root.val);
        }else {
            duplicate.push(root.val);
        }
        preorder(root.left,  visited,duplicate );
        preorder(root.right, visited,duplicate);
    }
}
