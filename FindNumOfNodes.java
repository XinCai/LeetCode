package lintcode;

/**
 * Created by caixin on 3/12/17.
 *
 *  求二叉树中的节点个数
 *
 *        1
 *     /     \
 *   -5       2
 *   /  \   /   \
 * 0    3  -4   -5
 *
 * 输入 根节点， root
 * 这个树 一共有 7 个节点， 返回 7
 *
 *  getNodeNumRec（递归）
 *
 *  null返回0，
 *
 *  然后把左右子树的size加上即可。
 *
 */
public class FindNumOfNodes {

    public int getNodeNum(TreeNode root){
        //递归必须 设定 跳出条件， 否则就会 进入死循环
        if (root == null) {
            return 0;
        }

        int rightNum = getNodeNum(root.right);
        int leftNum = getNodeNum(root.left);

        // 加上 root 这一个 node， 计算出总数
        return rightNum + leftNum + 1;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-5);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-4);
        TreeNode node7 = new TreeNode(-5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        FindNumOfNodes findNumOfNodes = new FindNumOfNodes();
        System.out.println(findNumOfNodes.getNodeNum(node1));
    }
}
