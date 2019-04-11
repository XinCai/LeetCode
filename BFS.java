package datastructers;

import java.util.*;

public class BFS {

    /**
     * A - B - D - E
     * |     \   /
     * C      F
     */

    public static void main(String[] args) {
        MyTreeNode A = new MyTreeNode("A");
        MyTreeNode B = new MyTreeNode("B");
        MyTreeNode C = new MyTreeNode("C");
        MyTreeNode D = new MyTreeNode("D");
        MyTreeNode F = new MyTreeNode("F");
        MyTreeNode E = new MyTreeNode("E");

        ArrayList<MyTreeNode> A_neib = new ArrayList();
        A_neib.add(B);
        A_neib.add(C);
        A.neightbours = A_neib;


        ArrayList<MyTreeNode> B_neib = new ArrayList();
        B_neib.add(A);
        B_neib.add(F);
        B_neib.add(D);
        B.neightbours = B_neib;

        ArrayList<MyTreeNode> C_neib = new ArrayList();
        C_neib.add(A);
        C.neightbours = C_neib;

        ArrayList<MyTreeNode> D_neib = new ArrayList();
        D_neib.add(B);
        D_neib.add(E);
        D.neightbours = D_neib;


        ArrayList<MyTreeNode> E_neib = new ArrayList();
        E_neib.add(D);
        E_neib.add(F);
        E.neightbours = E_neib;

        ArrayList<MyTreeNode> F_neib = new ArrayList();
        F_neib.add(B);
        F_neib.add(E);
        F.neightbours = F_neib;

        BFS bfs = new BFS();
        // bfs.bfsTravesal(A);
        List<MyTreeNode> paths = bfs.bfs(A, E);

        System.out.println(Arrays.toString( paths.toArray()));

    }

    private List bfs(MyTreeNode startNode , MyTreeNode target) {
        Queue<MyTreeNode> queue = new LinkedList<MyTreeNode>();
        ArrayList<MyTreeNode> paths = new ArrayList<MyTreeNode>();
        HashSet<MyTreeNode> visitedNodes = new HashSet<MyTreeNode>();

        queue.offer(startNode);
        visitedNodes.add(startNode);

        while (!queue.isEmpty()) {
            MyTreeNode current = queue.poll();
            if (current != target){
                paths.add(current);
            }

            List<MyTreeNode> neighbours = current.neightbours;
            System.out.println(current.value);
            for (MyTreeNode node : neighbours) {
                if (!visitedNodes.contains(node)) {
                    visitedNodes.add(node);
                    queue.offer(node);
                }
            }
        }

        paths.add(target);
        return paths;
    }

}
