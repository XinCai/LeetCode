package lintcode;


import java.util.LinkedList;
import java.util.Queue;

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class KnightShortPath {

    public static void main(String[] args) {

        boolean[][] grid = new boolean[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = false;
            }
        }

        Point source = new Point(2,0);
        Point destination = new Point(2,2);

        KnightShortPath shortPath = new KnightShortPath();
        System.out.println(shortPath.shortestPath(grid, source,destination));
    }

    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        // write your code here
        int[] deltaX = {1, 1, 2, 2, -1, -1, -2, -2};
        int[] deltaY = {2, -2, 1, -1, 2, -2, 1, -1};

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        int n = grid.length; // x length
        int m = grid[0].length; // y length

        Queue<Point> queue = new LinkedList<>();
        queue.offer(source);

        int steps = 0 ;

        // bfs level order traversal

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Point curr = queue.poll();
                if(curr.x == destination.x && curr.y == destination.y){
                    return steps;
                }

                for (int j = 0; j < 8; j++) {
                    Point nextPoint = new Point( curr.x + deltaX[j], curr.y + deltaY[j]);

                    if( !inBound(nextPoint, grid)){
                        continue;
                    }
                    queue.offer(nextPoint);

                    // mark next point could not be accessed
                    grid[nextPoint.x][nextPoint.y] = true;

                }
            }

            steps++;
        }

        return  -1;

    }

    private boolean inBound(Point nextPoint, boolean[][] grid) {
        if (nextPoint.x < 0 || nextPoint.x>= grid.length){
            return false;
        }

        if (nextPoint.y<0 || nextPoint.y >= grid[0].length){
            return false;
        }

        return grid[nextPoint.x][nextPoint.y] == false;
    }

}
