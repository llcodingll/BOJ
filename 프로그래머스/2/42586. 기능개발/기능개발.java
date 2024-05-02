import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int deployDay = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            queue.offer(deployDay);
        }
        
        List<Integer> deployList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int count = 1;
            int prevDeployDay = queue.poll();
            while (!queue.isEmpty() && queue.peek() <= prevDeployDay) {
                queue.poll();
                count++;
            }
            deployList.add(count);
        }
        
        return deployList.stream().mapToInt(Integer::intValue).toArray();
    }
}
