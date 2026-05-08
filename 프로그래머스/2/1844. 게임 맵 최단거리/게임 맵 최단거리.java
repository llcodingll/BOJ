import java.util.*;

class Solution {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static boolean[][] visited;
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        visited = new boolean[n][m];
        
        return bfs(0, 0, n, m, maps);
    }
    
    public int bfs(int x, int y, int maxX, int maxY, int[][] maps){
        ArrayDeque<int[]> que = new ArrayDeque<>();
        visited[x][y] = true;
        que.offer(new int[] {x,y});
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            
            int cx = cur[0];
            int cy = cur[1];
            
            if(cx == maxX-1 && cy == maxY-1) return maps[cx][cy];
            
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx < maxX && ny < maxY && nx >= 0 && ny >= 0 && maps[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    maps[nx][ny] = maps[cx][cy]+1;
                    que.offer(new int[] {nx, ny});
                }
            }
        }
        return -1;
    }
}