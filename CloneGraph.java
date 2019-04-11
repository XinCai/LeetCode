package lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


class UndirectedGraphNode {
      int label;
      ArrayList<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  }

public class CloneGraph {
    public HashSet<UndirectedGraphNode> getNodes(UndirectedGraphNode node){

        HashSet<UndirectedGraphNode> visited = new HashSet();
        Queue<UndirectedGraphNode> queue = new LinkedList();

        queue.offer(node);
        visited.add(node);

        while(!queue.isEmpty()){
            UndirectedGraphNode oldNode = queue.poll();
            visited.add(oldNode);

            for(UndirectedGraphNode neighbor : oldNode.neighbors){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        return visited;

    }
}
