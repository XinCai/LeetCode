package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class SearchInBinarySearchTree {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(18);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(22);
        TreeNode D = new TreeNode(63);
        TreeNode E = new TreeNode(84);

        A.left = B;
        A.right = C;
        C.right = D;
        D.right = E;

        searchBST(A,63);

    }


    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null){
            return null;
        }

        TreeNode result = null;

        Queue<TreeNode> queue = new LinkedList();
        HashSet<TreeNode> visited = new HashSet<>();
        queue.offer(root);

        while ( !queue.isEmpty()){
            TreeNode current = queue.poll();
            if (current.val == val){
                result = current;
            }

            visited.add(current);

            if (current.left !=null && !visited.contains(current.left)){
                queue.offer(current.left);
                visited.add(current.left);
            }

            if (current.right != null && !visited.contains(current.right)){
                queue.offer(current.right);
                visited.add(current.right);
            }

        }

        return result;
    }
}
