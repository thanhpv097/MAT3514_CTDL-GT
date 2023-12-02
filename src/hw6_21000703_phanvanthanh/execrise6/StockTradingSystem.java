package hw6_21000703_phanvanthanh.execrise6;

import hw6_21000703_phanvanthanh.execrise2.MinHeapPriorityQueue;

public class StockTradingSystem extends MinHeapPriorityQueue{
    public static void addOrder(MinHeapPriorityQueue<Double, String> minHeapPriorityQueue, double price, String description) throws Exception {
        minHeapPriorityQueue.insertHeapPQ( price, description + " at price " + price);
    }

    public static void processOrder(MinHeapPriorityQueue<Double, String> minHeapPriorityQueue) throws Exception {
        if (!minHeapPriorityQueue.empty()) {
            MinHeapPriorityQueue.ArrEntry nextOrder = minHeapPriorityQueue.removeMin();
            System.out.println("Processing Order: " + nextOrder.getValue());
        } else {
            throw new Exception("No more orders in the queue.");
        }
    }
}
