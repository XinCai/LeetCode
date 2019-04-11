package lintcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class CanReachThePoint {


    public static void main(String[] args) {
        int[][] map = new int[][]{
                {1, 1, 1, 1, 0, 1},
                {0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0},
                {1, 9, 1, 1, 0, 0}
        };

        CanReachThePoint reachThePoint = new CanReachThePoint();
        //reachThePoint.reachEndpoint(map);

        HashSet<MyPoint> set = new HashSet<>();
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(0,0);
        set.add(p1);
      //  set.add(p2);

        System.out.println(set.contains(p2));

    }


    public boolean reachEndpoint(int[][] map) {
            // Write your code here
            int[] deltaX = {1,-1,0, 0};
            int[] deltaY = {0, 0,1, -1};

            if(map == null || map.length ==0 || map[0].length == 0){
                return false;
            }

            MyPoint start = new MyPoint(0,0);

            Queue<MyPoint> queue = new LinkedList<>();
            HashSet<MyPoint> set = new HashSet<>();
            queue.offer(start);
            set.add(start);

            while(!queue.isEmpty()){

                MyPoint currPoint = queue.poll();

                for (int i = 0; i < 4 ; i++ ) {
                    MyPoint neighbor = new MyPoint(currPoint.x+deltaX[i], currPoint.y+deltaY[i]);

                    if(!inBound(map,neighbor) || set.contains(neighbor)){
                        continue;
                    }
                    if(map[neighbor.x][neighbor.y] == 9){
                        return true;
                    }
                    if(map[neighbor.x][neighbor.y] == 1){
                        queue.offer(neighbor);
                        set.add(neighbor);
                    }
                }
            }

            return false;
        }

        private boolean inBound(int[][] map, MyPoint point){
            if(point.x < 0 || point.x >= map.length){
                return false;
            }
            if(point.y < 0 || point.y >= map[0].length){
                return false;
            }
            if(map[point.x][point.y] == 0){
                return false;
            }
            return true;
        }
}

