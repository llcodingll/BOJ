import java.util.*;

class Solution {
    public int solution(int bridgeLength, int weightLimit, int[] truckWeights) {
        Queue<Integer> bridgeSlots = new LinkedList<>();
        
        for (int i = 0; i < bridgeLength; i++) {
            bridgeSlots.offer(0);
        }
        
        int elapsedTime = 0;
        int currentBridgeWeight = 0;
        int waitingTruckIndex = 0;
        
        while (waitingTruckIndex < truckWeights.length) {
            elapsedTime++;
            
            int exitedWeight = bridgeSlots.poll();
            currentBridgeWeight -= exitedWeight;
            
            int nextTruckWeight = truckWeights[waitingTruckIndex];
            
            if (currentBridgeWeight + nextTruckWeight <= weightLimit) {
                bridgeSlots.offer(nextTruckWeight);
                currentBridgeWeight += nextTruckWeight;
                waitingTruckIndex++;
            } else {
                bridgeSlots.offer(0);
            }
        }
        
        elapsedTime += bridgeLength;
        
        return elapsedTime;
    }
}